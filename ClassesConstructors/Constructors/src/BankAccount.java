public class BankAccount {
    
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(1234, 10.0, "Bob", "bob@example.com", "34523"); // as long as this is the first line that is called on an empty constructor, it can be used to set default values and will call the constructor below
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, double balance, String customerName, String email, String phone) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phone;
    }

    public void setAccountNumber(int value) {
        this.accountNumber = value;
    }

    public void setBalance(double value) {
        this.balance = value;
    }
    
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double value){
        this.balance += value;
    }

    public void withdrawFunds(double value){
        if (this.balance < value) {
            System.out.println("Insufficient Funds");
        } else {
            System.out.println("Successful withdraw");
            this.balance -= value;
        }
    }
}
