import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testFilter() {
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("hello");
        input1.add("hi");
        StringChecker sc = new StringChecker() {
            public boolean checkString(String s) { return true; }
        };

        assertArrayEquals(new String[]{"hello", "hi"}, ListExamples.filter(input1, sc).toArray());
    }
}
