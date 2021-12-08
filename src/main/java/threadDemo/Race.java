package threadDemo;

public class Race implements Runnable{
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (Thread.currentThread().getName().equals("兔子")){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"--->走了第"+i+"步");

            if (i>=100){
                System.out.println(Thread.currentThread().getName() + "is winner");
                break;
            }
        }
    }





    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
