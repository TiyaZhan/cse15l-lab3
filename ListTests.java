import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;


public class ListTests{
    @Test 
	public void testFilter() {
    ArrayList<String> input = new ArrayList<String>();
    ArrayList<String> exp = new ArrayList<String>();
    input.add("a");
    input.add("abcd");
    input.add("accd");
    exp.add("abcd");
  
    exp.add("accd");
    ArrayList<String> result = (ArrayList<String>)ListExamples.filter(input, new LongerString());
    assertEquals(exp.get(1), result.get(1));
	}

    @Test
    public void testMerge()
    {
        ArrayList<String> input1 = new ArrayList<String>();
        ArrayList<String> input2 = new ArrayList<String>();

        input1.add("a");
        input1.add("c");
        input2.add("b");
        input2.add("d");
        ArrayList<String> exp = new ArrayList<String>();
        exp.add("a");
        exp.add("b");
        exp.add("c");
        exp.add("d");

        assertEquals(exp, ListExamples.merge(input1, input2));
    }
}