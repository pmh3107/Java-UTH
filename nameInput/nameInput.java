package nameInput;

import java.util.Scanner;

public class nameInput {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("_Input full name_ the name will out put at capitalize each first character");
        System.out.println("Input your full name: ");
        String fullName = scanner.nextLine();
        // slit : separate to character base white space
        String[] words = fullName.split(" ");
        // ... ?
        StringBuilder outPut = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                outPut.append(firstChar).append(word.substring(1)).append(" ");
            }
        }
        System.out.println("Your full name after capitalization: " + outPut.toString());
    }
}
