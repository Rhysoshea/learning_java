public class App {
    public static void main(String[] args) {

        int myVariable = 50; //this entire line is a statement
        myVariable ++;
        myVariable --;
        System.out.println("This is a test");
        // each of the above are statements

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 and higher than 1000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        } //once this code block has processed, any variables created inside will be deleted
        // so final score will not be available outside of this block


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

    }
}
