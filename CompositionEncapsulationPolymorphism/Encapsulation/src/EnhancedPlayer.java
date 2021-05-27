public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;
    // making these fields private ensures they are encapsulated and cannot be accessed from outside of the class
    // any changes can be made without breaking external code (naming conventions etc)

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // got more control here on what the health can be
        if(health > 0 && health<=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }


    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return this.weapon;
    }


}
