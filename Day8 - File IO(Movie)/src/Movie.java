import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ruplaga on 7/27/2017.
 */
public class Movie {

    public static void main(String[] args) {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\ruplaga\\IdeaProjects\\IO2707\\src\\MovieDetails.txt");
            int b = fis.read();
            while (b != -1) {
                System.out.print((char)b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
