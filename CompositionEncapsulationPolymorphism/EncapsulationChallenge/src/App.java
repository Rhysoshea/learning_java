public class App {
    public static void main(String[] args) throws Exception {

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getNumPages());
        int pagesPrinted = printer.printPage(4);
        System.out.println("Pages printed was " + pagesPrinted);
        pagesPrinted = printer.printPage(7);
        System.out.println("Current page count = " + printer.getNumPages());

    }
}
