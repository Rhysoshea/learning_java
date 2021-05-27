public class VIPCustomer {
    
    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer(){
        this("Default", 0.0, "default@example.com");
    }

    public VIPCustomer(String name, double creditLimit){
        this(name, creditLimit, "default@example.com");
    }

    public VIPCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
