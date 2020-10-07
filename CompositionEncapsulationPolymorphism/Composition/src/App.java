public class App {
    public static void main(String[] args) throws Exception {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440)); // creating an instance of a class in place here for Resolution

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        // these methods won't work now as they have been set to private within the PC class
        // thePC.getMonitor().drawPixelAt(1500, 1200, "blue"); // can access the base functions of each class through each class that composes PC
        // thePC.getMotherboard().loadProgram("Windows");

        // this is different from inheritance where a Car is a Vehicle and inherits the same methods and variables
        // in this case a PC HAS a monitor, it HAS a case, a motherboard etc. so it is composed of different classes to build a new class

        thePC.PowerUp();
    }
}
