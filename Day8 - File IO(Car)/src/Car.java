import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by ruplaga on 7/27/2017.
 */
public class Car {
    public static void main(String[] args) {

        Set<String> carSet = new HashSet<>();

        carSet.add("Santro");
        carSet.add("Alto");
        carSet.add("Nano");
        carSet.add("i10");
        carSet.add("Audi");
        carSet.add("BMW");
        carSet.add("Mercedes");

        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            file = new File("C:\\Users\\ruplaga\\IdeaProjects\\IO2707\\src\\CarDetails.txt");
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            Iterator<String> itr = carSet.iterator();

            while (itr.hasNext()) {
                String carName = itr.next();
                bufferedWriter.write(carName + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
