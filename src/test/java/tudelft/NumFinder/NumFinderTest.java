package tudelft.numfinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumFinderTest {

    @Test
    void testFind() {
        NumFinder nf = new NumFinder();

        nf.find(new int[]{4, 25, 7, 9});
        assertEquals(4, nf.getSmallest());
        assertEquals(25, nf.getLargest());

        nf.find(new int[]{4, 3, 2, 1});
        assertEquals(1, nf.getSmallest());
        assertEquals(4, nf.getLargest());

        nf.find(new int[]{-10, -50, 0, 100});
        assertEquals(-50, nf.getSmallest());
        assertEquals(100, nf.getLargest());
    }
}
