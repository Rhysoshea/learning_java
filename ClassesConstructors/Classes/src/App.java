public class App {
    public static void main(String[] args) throws Exception {

        // to initalise the object of a class we use the new keyword
        Car porsche = new Car();
        // Car audi = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
