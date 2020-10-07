public class App {
    public static void main(String[] args) throws Exception {

        Car genericCar = new Car(4);
        Hatchback hatchback = new Hatchback(3);
        SportsCar sportsCar = new SportsCar();
        Van van = new Van();

        genericCar.accelerate();
        hatchback.accelerate();
        sportsCar.accelerate();
        van.brake();
        hatchback.printCar();

    }
}

class Hatchback extends Car {

    public Hatchback(int doors) {
        super(doors);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started for hatchback");
    }

    public void printCar(){
        System.out.println("This car is a " + getClass().getSimpleName());
    } 
    // getClass() is a standard method that comes with all classes and is a good way to get information on a class
    
}

class SportsCar extends Car {

    public SportsCar() {
        super(2);
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating very quickly");
    }

}


class Van extends Car {

    public Van() {
        super(3);
    }

    public void brake() {
        System.out.println("Brakes not working!");
    }

}
