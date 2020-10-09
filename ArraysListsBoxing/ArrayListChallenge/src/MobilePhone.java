import java.util.ArrayList;

public class MobilePhone {
 
    private ArrayList<Contact> contacts;


    public MobilePhone() {
        this.contacts = new ArrayList<Contact>(); // contacts is initalized when a MobilePhone object is created
    }


    public void getContacts(){
        System.out.println("You have " + contacts.size() + " contacts");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". Name: " + contacts.get(i).getName() + " Number: " + contacts.get(i).getPhoneNumber());
        }
    }

    public void addContact(String name, String phoneNumber){
        int index = contactExists(name);
        if (index<0){
            addContact(new Contact(name, phoneNumber));
        } else {
            System.out.println("Contact already exists");
        }
    }

    private void addContact(Contact newContact){
        contacts.add(newContact);
    }

    public void removeContact(String name){
        int index = contactExists(name);
        if (index >= 0){
            removeContact(index);
        }
    }
    
    private void removeContact(int index){
        contacts.remove(index);
        System.out.println("Removed contact");
    }

    public void updateContact(String name, String phoneNumber) {
        int index = contactExists(name);
        if (index >= 0) {
            updateContact(index, name, phoneNumber);
        }  
    }

    private void updateContact(int index, String name, String phoneNumber){
        contacts.set(index, new Contact(name, phoneNumber));
        System.out.println("Updated contact");
    }

    public Contact findContact(String name) {
        int index = contactExists(name);
        if (index >= 0) {
            return findContact(index);
        }
        return new Contact("Contact does not exist", "");
    }

    private Contact findContact(int index){
        return contacts.get(index);
    }

    private int contactExists(String name){
        for (int i=0; i<contacts.size(); i++){
            System.out.println(contacts.get(i).getName());
            if (contacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}
