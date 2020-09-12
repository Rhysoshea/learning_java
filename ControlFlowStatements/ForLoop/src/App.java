public class App {
    public static void main(String[] args) throws Exception {

        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        for (int i = 8; i >= 0; i--) {
            System.out
                    .println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int primeCount = 0;

        for (int i = 0; i<100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;
            }
            if (primeCount >=15 ){
                break;
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate ) {
        return (amount *(interestRate/100));
    }

    public static boolean isPrime(int n) {
        
        if (n == 1) {
            return false;
        }

        for (int i=2; i<= n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

}
