public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {

        int p1 = (int) (param1*1000.0);
        int p2 = (int) (param2*1000.0);
        
        // System.out.println(p1 + " " + p2);

        if (p1 == p2) {
            return true;
        }
        return false;
    }
}
