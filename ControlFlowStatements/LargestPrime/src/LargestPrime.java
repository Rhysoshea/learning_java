public class LargestPrime {
    
    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        
        int largestPrime = 1;

        for (int i=number; i>1; i--) {
            if (number%i == 0) {
                if (largestPrime%i == 0) {
                    largestPrime = 1;
                }  
                if (i > largestPrime){
                    largestPrime = i;
                }
            }
        }
        if (largestPrime != 1) {
            return largestPrime;
        }
        return -1;

    }

}
