import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTest {
    
    @Test
    public void testToString() {
        LinkedList myList = new LinkedList();
        myList.prepend(3);
        myList.prepend(5);
        myList.prepend(8);

        assertEquals("8 5 3 ", myList.toString());
        assertEquals(3, myList.length());
    }

}
