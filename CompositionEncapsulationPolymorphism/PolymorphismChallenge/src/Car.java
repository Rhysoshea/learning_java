public class Car {

    
    private boolean engine;
    private int doors;
    private int wheels;


    public Car(int doors) {
        this.engine = true;
        this.doors = doors;
        this.wheels = 4;
    }

    public boolean getEngine() {
        return this.engine;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getWheels() {
        return this.wheels;
    }

    public void startEngine(){
        System.out.println("Engine started");
    }

    public void accelerate(){
        System.out.println("Accelerating");
    }

    public void brake(){
        System.out.println("Braking");
    }

}
