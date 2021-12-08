package threadDemo;

public class ThreadDemo2 implements Runnable{

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("新开启的线程" + i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();

        new Thread(threadDemo2).start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("主线程"+i);
        }
    }
}
