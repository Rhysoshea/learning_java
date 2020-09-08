public class App {
    public static void main(String[] args) {

        // single precision, float has width of 32 bits
        // double precision has width of 64 bits

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5f; // good practice to use f with float 
        double myDoubleValue = 5d; // good practice to use d with double
        // double is assumed to be the default type for floating numbers
        // float myFloatTest = 5.25; // which is why this shows an error

        float myFloatTest = (float) 5.25;// needs to be casted, but easier to use f at end

        System.out.println("int = " + myIntValue/3); // can't handle the decimal
        System.out.println("float = " + myFloatValue/3);
        System.out.println("double = " + myDoubleValue/3); // has much greater precision than the float

        double myDoubleTest = 5.00; // can also specify the decimal points
        // current java libraries and modern computer architecture works faster with doubles than floats now as they are set up to work with doubles


        // convert pounds to kilograms

        double pounds = 200d;
        double result = pounds * 0.45359237;
        System.out.println(result);

    }
}
