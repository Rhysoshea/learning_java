import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // scanner is a built in method that reads text
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        
        boolean hasNextInt = scanner.hasNextInt(); // checking if the next integer input is valid
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); // automatically converts input to int
            scanner.nextLine(); // handles the next line character, need this otherwise will not allow name
                                // input

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // this reads a line of input from the console

            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }




        scanner.close(); //closes the scanner object
    }
}
