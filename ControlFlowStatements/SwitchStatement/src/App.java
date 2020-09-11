public class App {
    public static void main(String[] args) throws Exception {

        // can use a switch statement instead of many if else statements
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was 3, 4, or 5");
                System.out.println("actually it was a " + switchValue);
                break; // not including a break after every statement can give unpredictable results
                // in this case, ommitting the break will print this and the default statement

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'G';

        switch (charValue) {
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("was C, D, or E");
                System.out.println("actually it was a " + charValue);
                break; 

            default:
                System.out.println("Could not find character");
                break;
        }
        

        String monthValue = "January";

        // to lower case ensures that the month can be matched regardless of the case on each char and the input doesn't have to be as precise
        switch (monthValue.toLowerCase()) {
            case "january":
                System.out.println("Month is January");
                break;

            case "february":
                System.out.println("Month is February");
                break;

            default:
                System.out.println("Could not find month");
                break;
        }

    }
}
