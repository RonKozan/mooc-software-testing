package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;


public class CaesarShiftCipherTest {

    @ParameterizedTest(name="InputString={0}, Shift={1}, ExpRez={2}")
    @CsvSource({"abc, 0, abc", "abc, 1, bcd", "xyz, 1, yza",
            "bcd, -1, abc", "55,55, invalid","abc, 26, abc",
            "abc, -27, zab", "a b c, 1, b c d"})
    public void firstTest(String myString, int shift, String expResult){
        CaesarShiftCipher myCipher = new CaesarShiftCipher();
        String outputCipher = myCipher.CaesarShiftCipher(myString, shift);
        Assertions.assertEquals(expResult, outputCipher);
    }
}
