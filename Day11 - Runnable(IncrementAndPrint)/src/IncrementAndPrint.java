import org.junit.Test;

/**
 * Created by ruplaga on 7/31/2017.
 */
public class IncrementAndPrint {

    private int i = 010;
    @Test
    public void testValue() {
        for (int j = 0; j < 10; j++) {
            new Thread(() -> {
                i++;
            }).start();

            new Thread(() -> {
                System.out.println(i);
            }).start();
        }

    }
}
