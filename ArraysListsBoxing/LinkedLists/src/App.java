import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer("Tim", 54.84);
        Customer anotheCustomer;
        anotheCustomer = customer;
        anotheCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i<intList.size(); i++){
            System.out.println(i +": " + intList.get(i));
        }

        intList.add(1,2); // inserts 2 at position 1
        // moves values 3 and 4 down to make room for 2, so this requires a lot of work when the number of records is large
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        // this is why linked lists are useful
    }
}
