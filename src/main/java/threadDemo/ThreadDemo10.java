package threadDemo;

public class ThreadDemo10{
    public static void main(String[] args) {
        God god = new God();
        Thread thread = new Thread(god);
        thread.setDaemon(true);//默认为false用户线程,设置为true后为守护线程
        thread.start();

        You you = new You();
        new Thread(you).start();
    }



    static class You implements Runnable{

        public void run() {
            for (int i = 0; i < 36500; i++) {
                System.out.println("you are still alive");
            }
            System.out.println("goodbye world");
        }
    }

    static class God implements Runnable{

        public void run() {
            while (true){
                System.out.println("god alive forever");
            }
        }
    }
}
