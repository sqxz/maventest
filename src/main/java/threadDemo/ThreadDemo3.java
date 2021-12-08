package threadDemo;

public class ThreadDemo3 implements Runnable {
    private int tickNum = 10;
    public void run() {
        while (true){
            if (tickNum <= 0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---->拿到了第"+tickNum--);
        }
    }

    public static void main(String[] args) {
        ThreadDemo3 tick = new ThreadDemo3();
        new Thread(tick,"1号线程").start();
        new Thread(tick,"2号线程").start();
        new Thread(tick,"3号线程").start();
    }
}
