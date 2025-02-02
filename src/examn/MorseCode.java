package examn;

import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Välja mellan:");
            System.out.println("1: Översätt text till morskod");
            System.out.println("2: Översätt morskod till text" +
                    "");
            System.out.println("3:Avsluta");
            System.out.println("Du har valt:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Ange text för att översätta till morsekod: ");
                String text = scanner.nextLine();
                System.out.println("Morsekod: " + ConvertMorseCode.toMorse(text));

            } else if (choice == 2) {
                System.out.println("Ange morskod att översätta till text:");
                String morse = scanner.nextLine();
                System.out.println("Text: " + ConvertMorseCode.toEnglish(morse));
            } else if (choice == 3) {
                System.out.println("Avsluta programmet");
                break;
            } else {
                System.out.println("Ogiltig val, försök igen");
            }
        }
        scanner.close();
    }
}
