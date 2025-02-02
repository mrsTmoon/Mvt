package examn;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDictionary {
    private static final Map<Character, String> englishToMorse = new HashMap<>();
    private static final Map<String, Character> morseToEnglish=new HashMap<>();

    static {
        String[][] morseArray={
                {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}, {"E", "."},
                {"F", "..-."}, {"G", "--."}, {"H", "...."}, {"I", ".."}, {"J", ".---"},
                {"K", "-.-"}, {"L", ".-.."}, {"M", "--"}, {"N", "-."}, {"O", "---"},
                {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
                {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"}, {"Y", "-.--"},
                {"Z", "--.."}
        };

        for(String[] pair: morseArray){
            char letter =pair[0].charAt(0);
            String morse= pair[1];
            englishToMorse.put(letter,morse);
            morseToEnglish.put(morse,letter);
        }
    }

    public static String getMorseCode(char letter){
        return englishToMorse.get(letter);
    }

    public static Character getEnglishLetter(String morse){
        return morseToEnglish.get(morse);
    }
}
