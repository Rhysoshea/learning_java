public class App {


    public static void main(String[] args) throws Exception {

        Bank bankOne = new Bank("BankOne");
        bankOne.addBranch("BranchOne");
        bankOne.getBranches();
        System.out.println(bankOne.getBranch(1).getName());
        System.out.println(bankOne.getBranch(2));

        Branch branchOne = bankOne.getBranch(1);
        branchOne.addCustomer(100.0, "Rhys");
        branchOne.addCustomer(0.0, "Tom");
        branchOne.getCustomers();
        
        Customer customerOne = branchOne.getCustomer("Rhys");
        customerOne.addTransaction(250.0);
        customerOne.getTransactions();

        bankOne.getBranchCustomers(branchOne, false);
        bankOne.getBranchCustomers(branchOne, true);

        bankOne.getBranchCustomers(bankOne.getBranch(2), false);
    }
}
