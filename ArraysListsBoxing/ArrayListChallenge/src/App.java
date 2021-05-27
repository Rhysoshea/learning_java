import java.util.Scanner;

public class App {
    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) throws Exception {


        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 0:
                    mobilePhone.getContacts();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    printInstructions();
                    break;
                case 5:
                    quit=true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print contacts");
        System.out.println("\t 1 - To add contact");
        System.out.println("\t 2 - To remove contact");
        System.out.println("\t 3 - To update contact");
        System.out.println("\t 4 - To print instructions");
        System.out.println("\t 5 - To quit");

    }

    public static void addItem(){
        System.out.println("Please enter contact name and number");
        mobilePhone.addContact(s.nextLine(), s.nextLine());
    }

    public static void removeItem() {
        System.out.println("Please enter contact name");
        mobilePhone.removeContact(s.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Please enter contact name and new number");
        mobilePhone.updateContact(s.nextLine(), s.nextLine());
    }

}
