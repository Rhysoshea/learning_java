public class Dog extends Animal {
    // extending an abstract class you must inherit and override the methods that have been labeled abstract in the parent class
    // eat and breathe in this case, without them the IDE complains

    public Dog(String name) {
        super(name);
    }

    @Override 
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override 
    public void breathe() {
        System.out.println("Breathe in, breathe out");
    }
}
