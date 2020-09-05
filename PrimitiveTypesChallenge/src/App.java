public class App {
    public static void main(String[] args) throws Exception {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000 + 10 * (byteValue + shortValue + intValue);
        System.out.println(longTotal); // doesn't need to be casted as ints go into longs easily

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal); // needs to be casted as an int is bigger than a short
    }
}
