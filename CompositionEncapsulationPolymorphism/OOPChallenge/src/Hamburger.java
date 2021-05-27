public class Hamburger {
    
    private String bread;
    private boolean meat;
    private double price;

    private Addition additionOne;
    private Addition additionTwo;
    private Addition additionThree;
    private Addition additionFour;

    public Hamburger(String bread, boolean meat, double price) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }


    public String getBread() {
        return this.bread;
    }

    public boolean getMeat() {
        return this.meat;
    }

    public boolean isMeat() {
        return this.meat;
    }

    public double getBasePrice() {
        return this.price;
    }

    public double getFullPrice() {
        double basePrice = this.getBasePrice();
        System.out.println("Hamburger price = " + basePrice);
        double extrasPrice = 0;

        if (this.additionOne != null){
            System.out.println(this.additionOne.getName() + " added for an extra " + this.additionOne.getPrice());
            extrasPrice += this.additionOne.getPrice();
        }
        if (this.additionTwo != null){
            System.out.println(this.additionTwo.getName() + " added for an extra " + this.additionTwo.getPrice());
            extrasPrice += this.additionTwo.getPrice();
        }
        if (this.additionThree != null){
            System.out.println(this.additionThree.getName() + " added for an extra " + this.additionThree.getPrice());
            extrasPrice += this.additionThree.getPrice();
        }
        if (this.additionFour != null){
            System.out.println(this.additionFour.getName() + " added for an extra " + this.additionFour.getPrice());
            extrasPrice += this.additionFour.getPrice();
        }

        return basePrice + extrasPrice;
    }

    public void addExtraOne(String name, double price){
        this.additionOne = new Addition(name, price);
    }

    public void addExtraTwo(String name, double price) {
        this.additionTwo = new Addition(name, price);
    }

    public void addExtraThree(String name, double price) {
        this.additionThree = new Addition(name, price);
    }
    
    public void addExtraFour(String name, double price) {
        this.additionFour = new Addition(name, price);
    }
}
