import org.junit.Test;

import java.io.*;

/**
 * Created by ruplaga on 7/31/2017.
 */
public class ReadFiles {
    @Test
    public void fileReader() {

        File1 file1 = new File1();
        File2 file2 = new File2();

        Thread readFile1 = new Thread(file1);
        Thread readFile2 = new Thread(file2);

        readFile1.start();
        readFile2.start();
    }
}

class File1 implements Runnable {

    @Override
    @Test
    public void run() {
        InputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            fis = new FileInputStream("C:\\Users\\ruplaga\\IdeaProjects\\IO2707\\src\\MovieDetails.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
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

class File2 implements Runnable {

    @Override
    public void run() {
        InputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            fis = new FileInputStream("C:\\Users\\ruplaga\\IdeaProjects\\IO2707\\src\\CarDetails.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
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
