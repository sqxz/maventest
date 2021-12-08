package threadDemo;

public class ThreadDemo7 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是VIP线程"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo7 threadDemo7 = new ThreadDemo7();
        Thread thread = new Thread(threadDemo7);
        thread.start();
        for (int i = 0; i < 500; i++) {
            System.out.println("主线程"+i);
            if (i==200){
                thread.join();//强制执行VIP线程，执行完毕后再执行主线程
            }
        }
    }
}
