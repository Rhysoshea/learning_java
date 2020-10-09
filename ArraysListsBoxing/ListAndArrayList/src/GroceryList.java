import java.util.ArrayList;

public class GroceryList {
    
    private ArrayList<String> groceryList = new ArrayList<String>(); //this creates an ArrayList that contains strings
    // an ArrayList is a Class so has its own constructor


    public ArrayList<String> getGroceryList() {
        return this.groceryList;
    }

    // the private methods are handling indices of items in the list and not exposing this functionality to the user
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0){
            modifyGroceryList(position, newItem);
        }
    }

    private void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        // String thisItem = groceryList.get(position); //gets value of item at position
        groceryList.remove(position-1);// -1 to account for 0-based indexing
    }

    private int findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem); //returns true if item is present
        return groceryList.indexOf(searchItem); //returns index of item or -1 if not present
    }

    public boolean onFile(String item){
        int position = findItem(item);
        if (position >=0){
            return true;
        }
        return false;
    }
}
