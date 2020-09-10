public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.175, 2.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }
}
