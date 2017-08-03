import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

class RandomNumber implements Runnable{
    Thread thread1 = null;
    Thread thread2 = null;
    BlockingQueue<Double> numberList = new LinkedBlockingDeque<>();

    public static void main(String[] args) throws Exception{
        new RandomNumber();
        System.out.println("Finish");
    }

    public RandomNumber() {
        thread1 = new Thread(this);
        thread2 = new Thread(this);
        thread1.start();
        thread2.start();
    }

    public void run(){

        if(Thread.currentThread()  == thread1){
            for(int count =0 ;count <100;count++){
                try {
                    numberList.put(Math.random());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if(Thread.currentThread()  == thread2){
            while(!numberList.isEmpty()) {
                try {
                    System.out.println(numberList.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



