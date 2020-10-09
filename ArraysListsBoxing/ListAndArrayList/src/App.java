import java.util.Scanner;

public class App {
    private static Scanner s= new Scanner(System.in);
    private static int[] baseData = new int[10];

    // groceryList is an ArrayList
    private static GroceryList groceryList = new GroceryList();
    // an ArrayList handles the resizing automatically when adding new values
    // an ArrayList inherits from List
    public static void main(String[] args) throws Exception {

        // System.out.println("Enter 10 integers: ");
        // getInput();
        // printArray(baseData);
        // resizeArray();
        // System.out.println("Enter 12 integers: ");
        // getInput();
        // printArray(baseData);


        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice operations");
        System.out.println("\t 1 - To print the list of groceries");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To search for an item in the list");
        System.out.println("\t 7 - To quit");

    }

    public static void addItem() {
        System.out.println("Please enter the grocery item");
        groceryList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Current item name: ");
        String currentItem = s.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryList(currentItem, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item name: ");
        String currentItem = s.nextLine();
        groceryList.removeGroceryItem(currentItem);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = s.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in grocery list");
        } else {
            System.out.println(searchItem + " is not in list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); // this adds all the items into an arrayList

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); // and here's the same thing but during initialization

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray); // and another approach
    }

    private static void getInput(){
        for (int i=0; i<baseData.length; i++){
            baseData[i] = s.nextInt(); // this overwrites the values in baseData
        }
    }

    private static void printArray(int [] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];
        for (int i=0; i<original.length; i++){
            baseData[i] = original[i];
        }
    }

}
