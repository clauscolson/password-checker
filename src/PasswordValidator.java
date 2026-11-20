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
     static PasswordError validatePassword(String password) {
         if (password.isBlank()) {
             return PasswordError.EMPTY;
         } else if (password.length() < 8) {
             return PasswordError.TOO_SHORT;
         } else if (password.length() > 16) {
             return PasswordError.TOO_LONG;
         } else if (!password.matches("[a-zA-Z0-9]+")) {
             return PasswordError.INVALID_CHARACTERS;
         } else if (!hasLetterAndDigit(password)) {
             return PasswordError.MISSING_LETTER_OR_DIGIT;
         } return  PasswordError.NONE;
     }
}

