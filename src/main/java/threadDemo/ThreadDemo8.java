package threadDemo;

public class ThreadDemo8 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo8 threadDemo8 = new ThreadDemo8();
        Thread thread = new Thread(threadDemo8);

        Thread.State state = thread.getState();
        System.out.println(state+"1");

        thread.start();
        state = thread.getState();
        System.out.println(state+"2");

        while (state != Thread.State.TERMINATED){
            Thread.sleep(1000);
            state = thread.getState();
            System.out.println(state);
        }

    }
}
