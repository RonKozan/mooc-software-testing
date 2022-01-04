package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.io.PrintStream;

public class TwoNumbersSumTest {
    @Test
    public void sum121() {
        // Create our test parameters for 101 + 20 = 121
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(1,0,1));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(2,0));
        ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(1,2,1));
        // Run test
        runSumOfDigitsTest(first, second, expectedResult);
    }
    @Test
    public void sum00() {
        // Create our test parameters for 0 + 0 = 0
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(0));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(0));
        ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(0));
        // Run test
        runSumOfDigitsTest(first, second, expectedResult);
    }
    @Test
    public void sum70() {
        // Create our test parameters for 30 + 40 = 70
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(3,0));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(4,0));
        ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(7,0));
        // Run test
        runSumOfDigitsTest(first, second, expectedResult);
    }
    @Test
    public void sum22() {
        // Create our test parameters for 20 + 2 = 22
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(2,0));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(2));
        ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2,2));
        // Run test
        runSumOfDigitsTest(first, second, expectedResult);
    }
    @Test
    public void sum7203() {
        // Create our test parameters for 6500 + 703 = 7203
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(6,5,0,0));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(7,0,3));
        ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(7,2,0,3));
        // Run test
        runSumOfDigitsTest(first, second, expectedResult);
    }

    public void runSumOfDigitsTest(ArrayList<Integer> first, ArrayList<Integer> second,
                                   ArrayList<Integer> expectedResult) {
        // Comment out in production code.
        //System.out.println("First list is:" + first);
        //System.out.println("Second list is:" + second);
        //System.out.println("Expected Result is:" + expectedResult);

        // Here is the test - assert if result is unexpected
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(first, second);

        // Comment out in production code
        // System.out.println("Result list is:" + result);

        // Assert if result is unexpected
        Assertions.assertEquals(expectedResult, result);
    }

}
