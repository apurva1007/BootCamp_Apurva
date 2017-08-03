/**
 * Created by ruplaga on 8/1/2017.
 */
import java.util.concurrent.*;

public class PrimeNumberSum {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future1 = executorService.submit(new PrimeNumberGenerator(1,100));
        Future<Integer> future2 = executorService.submit(new PrimeNumberGenerator(101,200));
        Future<Integer> future3 = executorService.submit(new PrimeNumberGenerator(201,300));
        Future<Integer> future4 = executorService.submit(new PrimeNumberGenerator(301,400));
        Future<Integer> future5 = executorService.submit(new PrimeNumberGenerator(401,500));

        try {
            int result = future1.get()+future2.get()+future3.get()+future4.get()+future5.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class PrimeNumberGenerator implements Callable<Integer>{
    int start = 0;
    int end = 0;
    PrimeNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public Integer call(){
        int sum = 0;
        for(int i = start; i<= end; i++) {
            if (isPrime(i)) {
                //System.out.print(i + " ");
                sum = sum + i;
            }
        }
        return sum;
    }

    public boolean isPrime(int n) {

        int flag = 0;
        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            return true;
        else
            return false;
    }
}

