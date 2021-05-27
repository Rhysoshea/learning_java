import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner (System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) throws Exception {

        // non-static nested class AKA Inner Class
        Gearbox mcLaren = new Gearbox(6);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

        // to create the nested gear glass we have to use gearbox
        // this was the method when Gear was a public class
        // Gearbox.Gear first = mcLaren.new Gear(1, 12.3); // reference outer class first .new then inner class name
        // System.out.println(first.driveSpeed(1000));

        // Gearbox.Gear second = new Gearbox(2, 15.4); // doesn't work
        // Gearbox.Gear third = new mcLaren.Gear(3, 17.8); // doesn't work


        // following is separate to above
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        // the following 2 lines do the same thing
        // the first line requires the local class to be defined above
        btnPrint.setOnClickListener(new ClickListener());
        // this line doesn't require the above definition as is called an anonamous class
        // this class has no name and is defined in place by overriding the method onClick from Button
        // this is another type of inner class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    // this is to replicate a graphical button being clicked
    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();;
            }
        }
    }
}
