import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4, 5 };
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowerst() {
    double[] input1 = {1, 1, 1, 5};
    assertEquals(7.0/3, ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }
}
