package genericsandthreads;

public class Demo {

    public static void main(String[] args) {
        Thread producer;
        Thread consumer;

        Queue<String> queue = new Queue<>();

        producer = new Thread(()->{
            while(true){
                queue.push("Something from producer.");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        consumer = new Thread(()->{
            while(true) {
                String text = queue.first();
                System.out.println(text);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
