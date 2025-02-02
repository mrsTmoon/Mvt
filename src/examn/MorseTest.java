package examn;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseTest {

    @Test
    void testToMorse() {
        Assertions.assertEquals(".... . .-.. .-.. ---", ConvertMorseCode.toMorse("HELLO"));
        Assertions.assertEquals(".-- --- .-. .-.. -..", ConvertMorseCode.toMorse("WORLD"));
    }
    @Test
    void testToEnglish() {
        Assertions.assertEquals("HELLO", ConvertMorseCode.toEnglish(".... . .-.. .-.. ---"));
        Assertions.assertEquals("WORLD", ConvertMorseCode.toEnglish(".-- --- .-. .-.. -.."));
    }

    @Test
    void testInvalidCharacter() {
        Assertions.assertEquals(".... . .-.. .-.. ---", ConvertMorseCode.toMorse("HELLO!"));
    }

   @Test
    void testWordSeparation() {
      Assertions.assertEquals("- .- -.-. -.- / - --- -- .- ...", ConvertMorseCode.toMorse("TACK TOMAS"));
       Assertions.assertEquals("TACK TOMAS", ConvertMorseCode.toEnglish("- .- -.-. -.- / - --- -- .- ..."));
    }
}
