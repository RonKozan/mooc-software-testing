package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("tiger|dogs bats");
        Assertions.assertEquals(3, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void validWordAfterSpace() {
        int words = new CountLetters().count("cats dogr");
        Assertions.assertEquals(2, words);
    }
    @Test
    public void invalidWordAfterSpace() {
        int words = new CountLetters().count("Cats dogz");
        Assertions.assertEquals(1,words);
    }
    @Test
    public void noValidWords() {
        int words = new CountLetters().count("Catz Dogz sssratz");
        Assertions.assertEquals(0,words);
    }

}