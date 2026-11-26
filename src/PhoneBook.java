import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name;
        String contactName = "";
        String contactNumber = "";
        String choice = "";
        String foundName = null;
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Claus", "+123");
        contacts.put("John", "+133");
        contacts.put("Andrea", "+143");
        System.out.println("Welcome to ColsonBook! Enter contact name :");
        name = console.nextLine();
        for (String savedName : contacts.keySet()) {
            if (savedName.equalsIgnoreCase(name)) {
                foundName = savedName;
                break;
            }
        }
        if (foundName != null) {
            System.out.println("The contact number: " + contacts.get(foundName));
        } else {
            System.out.println("Contact not found!");
        }
        System.out.println("Do you want to create a new contact?");
        System.out.println("Yes");
        System.out.println("No");
        while ((!choice.equalsIgnoreCase("Yes")) && (!choice.equalsIgnoreCase("No"))) {
            choice = console.nextLine();
            if ((choice.equalsIgnoreCase("Yes"))) {
                System.out.println("Enter a number, please: ");
                System.out.println("- Number cannot be empty.");
                System.out.println("- Number must contain only digits and be at least 10 digits long!");
                contactNumber = console.nextLine();
                while (contactNumber.isBlank() || !contactNumber.matches("\\+?[0-9]{10,}")) {
                    System.out.println("Invalid number! Try again.");
                    contactNumber = console.nextLine();
                }
                System.out.println("Enter contact name, please: ");
                System.out.println("*enter a valid name using English letters and it must begin with a capital letter!");
                contactName = console.nextLine();
                while (contactName.isBlank() || !contactName.matches("[A-Z][a-zA-Z]+")) {
                    if (contactName.isBlank()) {
                        System.out.println("Name cannot be Empty!");
                        contactName = console.nextLine();
                    } else if (!contactName.matches("[A-Z][a-zA-Z]+")) {
                        System.out.println("Invalid name! Try again.");
                        contactName = console.nextLine();
                    }
                }
                boolean nameExists = true;
                while (nameExists) {
                    foundName = null;
                    for (String savedName : contacts.keySet()) {
                        if (savedName.equalsIgnoreCase(contactName)) {
                            foundName = savedName;
                            break;
                        }
                    }
                    if (foundName != null) {
                        System.out.println("Contact already exist.. Try again. ");
                        contactName = console.nextLine();
                    }else if (!contactName.matches("[A-Z][a-zA-Z]+") || contactName.isBlank()) {
                        System.out.println("Invalid name! Try again.");
                        contactName = console.nextLine();
                    } else {
                        nameExists = false;
                    }
                }
                    contacts.put(contactName, contactNumber);
                    System.out.println("Congrats! The contact was successfully added! : " + contacts.get(contactName));
                } else if (choice.equalsIgnoreCase("No")) {
                    System.out.println("The program ending..");
                    return;
                } else {
                    System.out.println("Invalid choice! Try again.");
                }
            }
        }
    }
