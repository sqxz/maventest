package threadDemo.syn;

public class BuyTicket implements Runnable{
    private int number = 1000;
    boolean flag = true;
    public static final Object lock = new Object();

    public void run() {
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void buy() throws InterruptedException {
        if (number<=0){
            flag = false;
            return;
        }else {
            Thread.sleep(1000);
            synchronized (this){
                System.out.println(Thread.currentThread().getName()+"买到了"+number--);
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        BuyTicket buyTicket = new BuyTicket();
        Thread thread = new Thread(buyTicket,"线程1");
        Thread thread1 = new Thread(buyTicket,"线程2");
        Thread thread3 = new Thread(buyTicket,"线程3");
        thread.start();
        thread1.start();
        thread3.start();
    }
}
