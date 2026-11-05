import java.util.Scanner;

import static java.lang.Character.isLetter;

public class PasswordValidator{
     private static boolean hasLetterAndDigit(String password) {
        boolean hasDigit = false;
        boolean hasLetter = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                }
                if (Character.isLetter(password.charAt(i))) {
                    hasLetter = true;
                }
            }
        return hasDigit && hasLetter;
    }
     static String getErrorMessage(String password) {
         if (password.isBlank()) {
             return "Password must not be empty.";
         } else if (password.length() < 8) {
             return "Password is too short.";
         } else if (password.length() > 16) {
             return "Password is too long.";
         } else if (!password.matches("[a-zA-Z0-9]+")) {
             return "Use only English letters and Digits!";
         } else if (!hasLetterAndDigit(password)) {
             return "At least one letter and one digit.";
         } return "";
     }
}

