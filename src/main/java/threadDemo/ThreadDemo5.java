package threadDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程休眠
 */
public class ThreadDemo5 {


    public static void main(String[] args) throws InterruptedException {
        int i =10;
        Date date = new Date(System.currentTimeMillis());
        while (true){
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
            date = new Date(System.currentTimeMillis());
            i --;
            if (i<=0){
                break;
            }
        }
    }
}
