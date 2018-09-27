package se.iths.martin.threads;



public class MultiThreadsDemo {


    public static void doSomething(){
        System.out.println("Runnable körs");
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

//        Thread thread = new Thread(()->doSomething());
//        thread.start();

        while(thread1.isAlive())
        {
            System.out.println("Hej från main thread");
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Thread is dead");




    }
}
