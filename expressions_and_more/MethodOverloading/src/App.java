public class App {
    public static void main(String[] args) throws Exception {
        int newScore = calculateScore("Rhys", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(3, 3) + " cm");
        System.out.println(calcFeetAndInchesToCentimeters(15) + " cm");
        System.out.println(calcFeetAndInchesToCentimeters(6, 0) + " cm");
        
    }

    // method overloading
    // allows us to create different 'versions' of the same method
    // good practice is to apply this when we want to perform similar actions but the input might vary
    // improves code readability and usability
    

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    //adding a method with the same name but is differentiated by the number of arguments passed
    // can also differentiate the type of argument passed
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no score");
        return 0;
    }


    // challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        
        if (feet < 0 || (inches < 0 || inches >12)){
            return -1;
        }
        return ((feet*12) + inches) * 2.54;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        
        if (inches < 0 ){
            return -1;
        }
        double feet = (inches-(inches%12))/12;
        inches = inches%12;
        // System.out.println(feet + "  " + inches);
        return calcFeetAndInchesToCentimeters(feet, inches);

    }

}
