package threadDemo;

public class ThreadDemo1 extends Thread{
    //创建线程方式1：继承Thread类，重写run方法，调用start()方法开启线程
    @Override
    public void run() {
        for (int i = 0;i<=100;i++){
            System.out.println("新的线程执行了"+ i);
        }
    }


    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();

        threadDemo1.start();//调用start()方法开启线程

        for (int i = 0;i<=1000;i++){
            System.out.println("主线程执行中"+i);
        }
    }
}
