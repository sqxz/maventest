package setdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetDemo
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/3/21 14:35
 **/
public class SetDemo {
    public static void main(String[] args){
        List<Message> messages = new ArrayList<Message>();
        messages.add(new Message(1,"吃饭了没"));
        messages.add(new Message(1,"吃饭了没"));
        messages.add(new Message(2,"放学回家"));
        messages.add(new Message(2,"放学回家"));
        messages.add(new Message(3,"睡觉"));

        List<Message> displayMessage = process(messages);

        for (Message message:displayMessage) {
            System.out.println(message.msg);
        }
    }

    public static List<Message> process(List<Message> received) {
        Set<Message> setMsgs = new TreeSet<Message>();

        List<Message> display = new ArrayList<Message>();
        for (Message message:received){
            setMsgs.add(message);
        }
        for (Message message:setMsgs){
            display.add(message);
        }
        return  display;
    }
}
