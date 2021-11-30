package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
    @ParameterizedTest(name="InputString={0}, ExpectedResult={1}")
    @CsvSource({"abXYZba, ab", "abca, a", "aba, aba", "abcdxa, a",
           "abba, abba", "abXXba, abXXba", "abxba, abxba", "abc,''"})
    //@CsvSource({"abXXba, abXXba"})
    public void mirrorStringTest(String myString, String expectedResult) {
        Mirror myMirror = new Mirror();
        String outputString = myMirror.mirrorEnds(myString);
        Assertions.assertEquals(expectedResult, outputString);
    }
}


