public class App {
    public static void main(String[] args) throws Exception {

        // Encapsulation stops outside classes or methods from accessing methods and variables from within a class

        // the variables of the instance can be accessed directly
        Player player = new Player();
        player.name = "Rhys";
        player.health = 100;
        player.weapon = "Sword";

        int damage = 20;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());


        damage = 30;
        player.health = 200; // the application/class is open to a user changing the fields directly
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // this can also become a problem because in a larger application, if a name change is made in the class and the variables are accessed elsewhere then the names need to be changed everywhere

        EnhancedPlayer newPlayer = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Remaining health = " + newPlayer.healthRemaining());
    }
}
