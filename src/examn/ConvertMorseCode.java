package examn;

public class ConvertMorseCode {
    public static String toMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        text = text.toUpperCase();
        for (char character : text.toCharArray()) {
            if (character == ' ') {
                morseCode.append("/ ");
                continue;
            }
            String morse = MorseCodeDictionary.getMorseCode(character);
            if (morse == null) {
                System.out.println("Varning: Tecknet '" + character + "' kan inte översättas.");
                continue;

            }
            morseCode.append(morse).append(" ");
        }
        return morseCode.toString().trim();
    }

    public static String toEnglish(String morse) {
        StringBuilder englishText = new StringBuilder();
        String[] words = morse.split(" / ");

        for (String word : words) {
            String[] letters = word.split(" ");
            for (String morseLetter : letters) {
                Character letter = MorseCodeDictionary.getEnglishLetter(morseLetter);
                if (letter == null) {
                    System.out.println("Varning: Morkoden'" + morseLetter + "' kan inte översättas och ignoreras.");
                    continue;
                }
                englishText.append(letter);
            }
            englishText.append(" ");

        }
        return englishText.toString().trim();
    }
}
