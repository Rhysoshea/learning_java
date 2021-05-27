import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String name;


    public Customer(Double initialTransaction, String name) {
        this.transactions = new ArrayList<Double>();
        this.name = name;
        addTransaction(initialTransaction);
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public String getName() {
        return this.name;
    }

    public void addTransaction(Double transaction){
        this.transactions.add(transaction);
        System.out.println("Transaction added");
    }

    public static Customer createCustomer(Double initialTransaction, String name){
        return new Customer(initialTransaction, name);
    }
    
}
