public class Main {
    public static void main(String[] args) {
        // Integer is a wrapper class, all primitive types have these
        // this lets us perform operations on integer types
        // integer has 32 bits (width of 32)
        int myMinIntValue = Integer.MIN_VALUE; 
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1)); // this will cause overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1 )); // this will cause underflow

        // int myMaxIntTest = 2147483648; //will cause an error as literal value is too large for integer type
        int myMaxIntTest = 2_147_483_647;  //can write integers this way for easier reading

        // byte occupies 8 bits, so say a byte has a width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByteValue);
        System.out.println("Byte max value = " + myMaxByteValue);

        // short has width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = " + myMinShortValue);
        System.out.println("Short max value = " + myMaxShortValue);

        // long has width of 64
        long myLongValue = 100;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLongValue);
        System.out.println("Long max value = " + myMaxLongValue);
        // typical to put L on the end of a long, needed when value is beyond boundaries of integer type
        long bigLongLiteralValue = 2_147_483_647_234L;


        //Arithmetic and Casting

        int myTotal = (myMinIntValue / 2);

        // byte myNewByteValue = (myMinByteValue / 2); // treating the number as an int but needs to be cast to a byte

        // casting means to convert a number from one type to another and is done like below
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
        // best to use integer unless good reason not to

    }
}
