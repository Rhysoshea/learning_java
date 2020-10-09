import java.util.ArrayList;

public class Bank {
    
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName(){
        return this.name;
    }

    public void addBranch(String name){
        Branch branch = new Branch(name);
        if (this.branches.contains(branch)){
            System.out.println("Bank already exists");
            return;
        }
        this.branches.add(branch);
        System.out.println("New branch added");
    }

    public void addCustomerToBranch(Branch branch, Double initialTransaction, String name) {
        branch.addCustomer(initialTransaction, name);
    }

    public void getBranchCustomers(Branch branch, boolean transactions){

        if (this.branches.contains(branch)){
            ArrayList<Customer> customers = branch.getCustomers();

            for (int i = 0; i < customers.size(); i++) {
                System.out.println(customers.get(i).getName());
                if (transactions) {
                    System.out.println(customers.get(i).getTransactions().toString());
                }
            }
        } 
    }

    public void getBranches(){
        for (int i=0; i<this.branches.size(); i++){
            System.out.println((i+1) + " . " + this.branches.get(i).toString());
        }
    }

    public Branch getBranch(int index) {
        if (index-1 < this.branches.size()){
            return this.branches.get(index-1);
        }
        System.out.println("Branch does not exist");
        return null;
    }

}
