public class Car extends Vehicle {
    
    private int wheels;
    private int gears;
    private int currentGear;

    public Car(int engine, int body, String colour, int speed, int wheels, int gears) {
        super (engine, body, colour);
        this.wheels = wheels;
        this.gears = gears;
        this.currentGear = 1;
    }

    public int getWheels() {
        return this.wheels;
    }


    public int getCurrentGear() {
        return this.currentGear;
    }

    public int getGears() {
        return this.gears;
    }

    public void changeGears(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Changing gear to " + currentGear);
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Change car velocity to speed: " + speed + " direction: " + direction);
    }


}
