package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name="InputString={0}")
    // note that the behaviour if no 'g' is present is not
    // clear in the specs; we assume no 'g' means none
    // are unhappy. Check with client before submitting!
    @CsvSource({"xxggxx", "ggg", "gggg","aaa"})
    public void trueTest(String myString){
        GHappy mygHappy = new GHappy();
        Boolean rez = mygHappy.gHappy(myString);
        Assertions.assertTrue(rez);
    }
    @ParameterizedTest(name="InputString={0}")
    @CsvSource({"xxgxx","aga","gag"})
    public void falseTest(String myString){
        GHappy mygHappy = new GHappy();
        Boolean rez = mygHappy.gHappy(myString);
        Assertions.assertFalse(rez);
    }
}