public class App {
    public static void main(String[] args) throws Exception {

    BankAccount account = new BankAccount();
    account.setAccountNumber(1234);
    account.setBalance(100.0);
    account.setCustomerName("John");
    account.setEmail("john@example.com");
    account.setPhoneNumber("03942342");
    
    System.out.println(account.getAccountNumber());
    System.out.println(account.getBalance());
    System.out.println(account.getCustomerName());
    System.out.println(account.getEmail());
    System.out.println(account.getPhoneNumber());

    account.depositFunds(10.0);
    account.withdrawFunds(50.0);
    account.withdrawFunds(61.0);

    // this uses a constructor - a method in the class object that initialises the class with some properties
    BankAccount newAccount = new BankAccount(1234, 10.0, "Bob", "bob@example.com", "34523");

    VIPCustomer vipAccount = new VIPCustomer();
    VIPCustomer vipCustomer = new VIPCustomer("Bob", 1234.0);

    }
}
