public class Dog extends Animal {
    
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super (name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    } // super calls  the constructor of the class that we are extending from
    
    public void chew(){
        System.out.println("Dog chew called");
    }

    // this overrides the eat() method in Animal class but also calls that method within
    @Override
    public void eat() {
        System.err.println("Dog eat called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog walk called");
        move(5);
    }

    public void run() {
        System.out.println("Dog run called");
        super.move(10); // using super here specifies to use the move method from Animal
        // super is not needed if the method doesn't have an override in the child class
    }

    public void moveLegs(int speed) {
        System.out.println("Dog moving legs at " + speed);
    }

    // Dog class has an override of the move method but also inherits the move method
    @Override
    public void move(int speed) {
        System.out.println("Dog move called");
        moveLegs(speed);
        super.move(speed);
    }
}
