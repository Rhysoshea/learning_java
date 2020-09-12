public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        
        if (number < 0) {
            number *= -1;
        }

        int numCopy = number;
        int newNumber = 0;

        while (numCopy > 0) {
            newNumber = (newNumber*10) + numCopy%10;
            numCopy /= 10;
        }

        if (newNumber == number) {
            return true;
        }

        return false;
    }
}
