public class App {

    // adding a constant to be used locally
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) throws Exception {

        System.out.println(getDurationString(59, 59));
        System.out.println(getDurationString(188, 9));
        System.out.println(getDurationString(0, 59));
        System.out.println(getDurationString(0, 60));

        System.out.println(getDurationString(60));
        System.out.println(getDurationString(6000));

    }

    public static String getDurationString(int minutes, int seconds) {
        
        if (minutes < 0 || (seconds<0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        minutes = minutes%60;

        // this gives a leading zero to the output
        String hoursString = stringify(hours, "h");
        String minutesString = stringify(minutes, "m");
        String secondsString = stringify(seconds, "s");

        return(hoursString+ " " + minutesString + " " + secondsString);

    }

    public static String stringify(int input, String type) {
        String outputString = input + type;
        if (input < 10) {
            outputString = "0" + outputString;
        }
        return outputString;
        
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);

    }
}
