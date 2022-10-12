import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedSize2()
  {
    int[] input = {2, 3};
    assertArrayEquals(new int[] {3,2}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReversedSize1()
  {
    int[] input = {2};
    assertArrayEquals(new int[] {2}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReversedInPlaceEven()
  {
    int[] input = {2, 3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {3,2}, input);
  }

  @Test
  public void testReversedInplaceOdd()
  {
    int[] input = {2,3,4};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {4, 3, 2}, input);
  }

  @Test
  public void testAveragesize3()
  {
    double[] input = {2.0,3.0,4.0};

    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input),0);
  }
  @Test
  public void testAveragesize2()
  {
    double[] input = {2.0,4.0, 2.0};

    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input),0);
  }
}
