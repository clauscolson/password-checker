import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String password;
        String name;
        System.out.println("Hello! What's your name?");
        System.out.println("*enter a valid name using English letters and it must begin with a capital letter!");
        name = console.nextLine();
        while (name.isBlank() || !name.matches("[A-Z][a-zA-Z]*")) {
            if (name.isBlank()) {
                System.out.println("Name cannot be Empty!");
                name = console.nextLine();
            } else if (!name.matches("[A-Z][a-zA-Z]*")) {
                System.out.println("Invalid name! Try again.");
                name = console.nextLine();
            }
        }
        boolean passwordIsValid = false;
        System.out.println("Welcome, " + name + "!");
        System.out.println("Password requirements:");
        System.out.println("- Only English letters and digits.");
        System.out.println("- Must not be empty.");
        System.out.println("- 8–16 characters long.");
        System.out.println("- At least one letter and one digit.");
        while (!passwordIsValid) {
            System.out.println("Create your password: ");
            password = console.nextLine();
            String error = PasswordValidator.getErrorMessage(password);
            if (error.isEmpty()){
                System.out.println("Pass is valid.");
                passwordIsValid = true;
            } else {
                System.out.println(error);
            }
        }
    }
}