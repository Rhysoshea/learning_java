public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first<10 || second < 10) {
            return -1;
        }

        int min=second;
        if (first < second){
            min = first;
        }

        int gcd = 0;

        while (min>0) {
            if (first%min == 0 && second%min == 0) {
                gcd = min;
                break;
            }
            min--;
        }
        return gcd;
    }
}
