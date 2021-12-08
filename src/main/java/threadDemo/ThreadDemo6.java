package threadDemo;

public class ThreadDemo6 implements Runnable{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();//线程礼让
        System.out.println(Thread.currentThread().getName()+"线程结束执行");
    }

    public static void main(String[] args) {
        ThreadDemo6 threadDemo6 = new ThreadDemo6();
        new Thread(threadDemo6,"a").start();
        new Thread(threadDemo6,"b").start();
    }
}
