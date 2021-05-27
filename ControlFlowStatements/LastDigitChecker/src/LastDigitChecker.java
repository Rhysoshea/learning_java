public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int aLast = a%10;
        int bLast = b%10;
        int cLast = c%10;

        if (aLast == bLast || bLast == cLast || aLast == cLast) {
            return true;
        }

        return false;

    }

    public static boolean isValid(int number) {
        if (number < 10 || number >1000){
            return false;
        }
        return true;
    }
}
