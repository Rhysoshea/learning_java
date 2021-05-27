public class HealthyBurger extends Hamburger{
    
    private Addition healthyAdditionOne;
    private Addition healthyAdditionTwo;

    public HealthyBurger(boolean meat, double price){
        super("Brown rye", meat, price);
    }

    public void addHealthyExtraOne(String name, double price) {
        this.healthyAdditionOne = new Addition(name, price);
    }

    public void addHealthyExtraTwo(String name, double price) {
        this.healthyAdditionTwo = new Addition(name, price);
    }

    @Override
    public double getFullPrice() {
        double basePrice = super.getFullPrice();
        double extrasPrice = 0;

        if (this.healthyAdditionOne != null) {
            System.out.println(this.healthyAdditionOne.getName() + " added for an extra " + this.healthyAdditionOne.getPrice());
            extrasPrice += this.healthyAdditionOne.getPrice();
        }
        if (this.healthyAdditionTwo != null) {
            System.out.println(this.healthyAdditionTwo.getName() + " added for an extra " + this.healthyAdditionTwo.getPrice());
            extrasPrice += this.healthyAdditionTwo.getPrice();
        }


        return basePrice + extrasPrice;
    }


}
