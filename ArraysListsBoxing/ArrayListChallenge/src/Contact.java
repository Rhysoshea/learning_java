public class Contact {
    
    private String name;
    private String phoneNumber;


    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // this is a method for calling the constructor for static methods
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}
