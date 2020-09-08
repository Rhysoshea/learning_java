public class App {
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);

        highScore = calculateScore(true, 1000, 8, 500);
        System.out.println("your final score was " + highScore);


        int highScorePosition = calculatePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculatePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculatePosition(400);
        displayHighScorePosition("Ben", highScorePosition);

        highScorePosition = calculatePosition(50);
        displayHighScorePosition("Harry", highScorePosition);
    }

    // defining a new method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculatePosition (int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) { 
            return 2;
        } else if (playerScore >= 50) {
            return 3;
        }
        return 4;

    }
}
