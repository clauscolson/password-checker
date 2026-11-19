import java.util.Scanner;

public class Wzup {
    static void main() {
        int age;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, enter your name, please!");
        name = scanner.nextLine();
        System.out.println("Enter your age, " +name+ " please");
        age = scanner.nextInt();
        while(age < 0) {
            System.out.println("Age cannot be negative! "+ name +" Enter your real age!");
            age = scanner.nextInt();
        }
        if (age < 18) {
            System.out.println("You're minor " + name);
        }else{
            System.out.println("You're adult! " + name);
        }
        int years = age + 5;
        System.out.println("Great! In 5 years you'll be " + years);


    }
}
