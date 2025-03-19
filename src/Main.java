import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner Obj
        Scanner scanner = new Scanner(System.in);
        // Initialize variables
        String adj1;
        String noun1;
        String adj2;
        String verb1;
        String adj3;

        // Get user input
        System.out.println("Enter an adjective (description): ");
        adj1 = scanner.nextLine();
        System.out.println("Enter an noun (animal/person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adj2 = scanner.nextLine();
        System.out.println("Enter an verb (end with -ing): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adj3 = scanner.nextLine();

        // Print madlib
        System.out.println("Today I went a " + adj1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adj2 + " and " + verb1 + "!");
        System.out.println("I was " + adj3 + "!");

        scanner.close();
    }
}