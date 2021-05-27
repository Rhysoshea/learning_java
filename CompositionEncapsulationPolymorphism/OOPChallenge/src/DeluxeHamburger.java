public class DeluxeHamburger extends Hamburger{


        public DeluxeHamburger(String bread, boolean meat, double price){
            super(bread, meat, price);
            super.addExtraOne("Chips", 0.5);
            super.addExtraTwo("Drink", 1.5);
        }

        @Override
        public void addExtraOne(String name, double price) {
           System.out.println("Cannot add additional items to deluxe burger");
        }

        @Override
        public void addExtraTwo(String name, double price) {
            System.out.println("Cannot add additional items to deluxe burger");
        }

        @Override
        public void addExtraThree(String name, double price) {
            System.out.println("Cannot add additional items to deluxe burger");
        }

        @Override
        public void addExtraFour(String name, double price) {
            System.out.println("Cannot add additional items to deluxe burger");
        }

}
