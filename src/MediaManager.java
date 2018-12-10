import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class MediaManager {

    public  ArrayList<File> readFolder(String folderName) {

        File mediaFolder = new File(folderName);

        // Kan kun få filerne i biblioteket som array med "listfiles()"
        File[] listOfFiles = mediaFolder.listFiles();

        // Konverterer array til arraylist
        ArrayList<File> fileArr = new ArrayList<File>(Arrays.asList(listOfFiles));

        return fileArr;
    }

}
