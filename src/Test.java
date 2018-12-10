import java.util.ArrayList;

public class Test {

    private static MediaManager mm = new MediaManager();

    // Denne metode indeholder test-kode, som kan vise applikationens funktionalitet (ikke unit test)
    public static void test() {

        System.out.println("Hello World");

        Video m1 = new Video();
        m1.setName("Julemanden");
        m1.setFileName("julemand.jpg");
        System.out.println(m1.toString());

        ArrayList filer = mm.readFolder("media/");

        for (int i = 0; i < filer.size(); i++) {

            System.out.println(filer.get(i));
        }

    }
}
