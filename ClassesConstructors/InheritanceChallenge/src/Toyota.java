public class Toyota extends Car {
    
    private int roadServiceMonths;

    public Toyota(int roadServiceMonths) {
        super(1, 1, "Silver", 0, 4, 5);
        this.roadServiceMonths = roadServiceMonths;
    }


    public int getRoadServiceMonths() {
        return this.roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getSpeed() + rate;
        if (newVelocity == 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGears(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGears(2);
        } else {
            changeGears(3);
        }

        if (newVelocity > 0 ){
            move(newVelocity, getDirection());
        }
    }

}
