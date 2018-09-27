package se.iths.martin.threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hej från extra thread");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
