package threadDemo;

public class ThreadDemo4 implements Runnable{
    private boolean flag = true;

    public void run() {
        int i = 0;
        while (flag){
            System.out.println("新的线程执行到第" + i++);
        }
    }

    public void stopThread(){
        this.flag = false;
    }

    public static void main(String[] args) {
        ThreadDemo4 threadDemo4 = new ThreadDemo4();
        new Thread(threadDemo4).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程一直跑着"+i);
            if (i==900){
                threadDemo4.stopThread();
                System.out.println("新的线程执行这里停止");
            }
        }
    }
}
