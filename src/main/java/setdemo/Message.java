package setdemo;

/**
 * @ClassName Message
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/3/21 14:36
 **/
public class Message implements Comparable<Message>{
    public int secquence;
    public String msg;

    public Message(int secquence,String msg){
        this.secquence = secquence;
        this.msg = msg;
    }

    public int compareTo(Message o) {
        if (this.secquence > o.secquence){
            return 1;
        }
        if (this.secquence < o.secquence){
            return -1;
        }
        return 0;
    }
}
