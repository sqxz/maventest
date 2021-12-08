package threadDemo;

public class ThreadDemo9 implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadDemo9 threadDemo9 = new ThreadDemo9();
        Thread thread1 = new Thread(threadDemo9);
        Thread thread2 = new Thread(threadDemo9);
        Thread thread3 = new Thread(threadDemo9);
        Thread thread4 = new Thread(threadDemo9);

        thread1.setPriority(1);
        thread1.start();

        thread2.setPriority(10);
        thread2.start();

        thread3.setPriority(3);
        thread3.start();

        thread4.setPriority(5);
        thread4.start();
    }
}
