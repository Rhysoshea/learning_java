public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        
        if ( (a<10 || a>99) || (b<10 || b>99) ) {
            return false;
        }
        int bCopy = b;
        while (a>0) {
            int digit = a%10;
            a /= 10;
            while (bCopy > 0) {
                if (digit == bCopy%10){
                    return true;
                }
                bCopy/=10;
            }
            bCopy = b;
        }


        return false;
    }
}
