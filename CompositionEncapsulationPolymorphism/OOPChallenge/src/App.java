public class App {
    public static void main(String[] args) throws Exception {


        Hamburger hamburger = new Hamburger("Plain", true, 4.5);
        System.out.println(hamburger.getBasePrice());

        hamburger.addExtraOne("Tomato", 0.5);
        hamburger.addExtraTwo("Cheese", 0.9);
        hamburger.addExtraThree("Ketchup", 0.1);

        System.out.println("Hamburger price = " + hamburger.getFullPrice());

        HealthyBurger healthy = new HealthyBurger(true, 5.5);
        healthy.addExtraOne("Tomato", 0.5);
        healthy.addExtraTwo("Cheese", 0.9);
        healthy.addExtraThree("Ketchup", 0.1);
        healthy.addExtraFour("Pickle", 0.5);
        healthy.addHealthyExtraOne("Lettuce", 0.8);

        System.out.println("Healthy hamburger price = " + healthy.getFullPrice());

        DeluxeHamburger deluxe = new DeluxeHamburger("White", true, 14);
        deluxe.addExtraFour("Lettuce", 1);

        System.out.println("Deluxe hamburger price = " + deluxe.getFullPrice());
    }
}
