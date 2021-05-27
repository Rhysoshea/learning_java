public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public int getAge() {
        return this.age;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public void setAge(int value) {
        if (value <0 || value >100) {
            value = 0;
        }
        this.age = value;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName() {
        if (this.firstName.isEmpty()){
            return this.lastName;
        }
        if (this.lastName.isEmpty()){
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }
}

