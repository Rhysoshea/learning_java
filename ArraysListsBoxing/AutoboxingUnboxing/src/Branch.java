import java.util.ArrayList;

public class Branch {
    
    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public Customer getCustomer(String name){
        int index = findCustomer(name);
        if (index >= 0) {
            return customers.get(index);
        } else {
            System.out.println("Customer does not exist");
            return null;
        }
    }

    public void addCustomer(Double initialTransaction, String name){
        int index = findCustomer(name);
        if (index >= 0){
            System.out.println("Customer already exists");
            return;
        }
        this.customers.add(new Customer(initialTransaction, name));
        System.out.println("New customer added to branch");
    }

    public void addTransaction(Double transaction, String name){
        int index = findCustomer(name);

        if (index >= 0) {
            customers.get(index).addTransaction(transaction);
        } else {
            System.out.println("Customer does not exist");
        }
    }

    private int findCustomer(String name){
        for (int i=0; i<customers.size(); i++){
            if (customers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String getName(){
        return this.name;
    }

    public static Branch createBranch(String name){
        return new Branch(name);
    }

}
