public class Vehicle {
    
    private int engine;
    private int body;
    private String colour;
    private int speed;
    private int direction;

    public Vehicle(int engine, int body, String colour) {
        this.engine = engine;
        this.body = body;
        this.colour = colour;
        this.speed = 0;
        this.direction = 0;
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Steering at " + direction + " degrees");
    }
    

    public void changeSpeed(int speed) {
        this.speed = speed;
        System.out.println("Changing speed to " + speed);
    }

    public void move(int speed, int direction) {
        this.steer(direction);
        this.changeSpeed(speed);
    }

    public int getEngine() {
        return this.engine;
    }

    public int getBody() {
        return this.body;
    }

    public String getColour() {
        return this.colour;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDirection() {
        return this.direction;
    }

    public void stop() {
        this.speed = 0;
    }

}
