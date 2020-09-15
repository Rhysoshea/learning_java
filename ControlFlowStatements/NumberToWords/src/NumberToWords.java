public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {

            int newNum = reverse(number);
            // System.out.println(newNum);
            int numOriginal = getDigitCount(number);
            int numReverse = getDigitCount(newNum);

            while (newNum >= 0) {

                int digit = newNum%10;
                newNum /= 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                       System.out.println( "Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    default:
                        System.out.println("Nine");
                }
                if (newNum==0) {
                    break;
                }

            }

            for (int i = 0; i < (numOriginal - numReverse); i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {

        int rev = 0;
        boolean negative = false;
        if (number<0) {
            negative = true;
            number *= -1;
        }

        while (number > 0) {
            int digit = number%10;
            rev = rev*10 + digit;
            number /= 10;
        }
        
        if (negative){
            rev*=-1;
        }
        return rev;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0){
            return 1;
        }
        
        int count=0;

        while (number>0){
            number/=10;
            count++;
        }
        return count;
    }
}
