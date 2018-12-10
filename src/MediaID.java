import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {

    private static int latestId = 100;


    public static int generate() {

        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        try {


            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();
            }

            latestId++;

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        return latestId;
    }

}