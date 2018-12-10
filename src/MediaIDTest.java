import java.util.Arrays;

import static org.junit.Assert.*;

public class MediaIDTest {

    @org.junit.Test
    public void generateTest() {

        int[] idArray = new int[100];

        for (int i = 0; i < 100; i++) {
            int nyId =         MediaID.generate();
            boolean found = Arrays.asList(idArray).contains(i);
            assertFalse(found);
            idArray[i] = nyId;
        }

        System.out.println(Arrays.toString(idArray));

    }
}