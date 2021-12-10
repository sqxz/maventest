package threadDemo.sendMsg;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SendMsgByThread {
    public static void main(String[] args) {
        Thread thread = new MsgThread();
        thread.start();
    }

    static class MsgThread extends Thread{
        @Override
        public void run() {
            String startWorkTime =  LocalTime.of(21, 05).toString();
            String endWorkTime =  LocalTime.of(14, 46).toString();
            DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");


            while (true){
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(df.format(LocalDateTime.now()).equals(startWorkTime) || df.format(LocalDateTime.now()).equals(endWorkTime)){
                    CloseableHttpClient httpClient = HttpClients.createDefault();
                    HttpPost httpPost = new HttpPost("https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=06c79673-d788-46ef-a773-2f6e4b2ac705");
                    httpPost.addHeader("Content-Type", "application/json");
                    JSONObject json = new JSONObject();

                    json.put("msgtype","text");
                    JSONObject json1 = new JSONObject();
                    json1.put("content","@所有人 打卡啦");

                    json.put("text",json1);

                    System.out.println(json);

                    httpPost.setEntity(new StringEntity(json.toString(),"UTF-8"));
                    try {
                        httpClient.execute(httpPost);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}
