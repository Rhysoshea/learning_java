import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        // ArrayList<int> intArrayList = new ArrayList<int>(); // this doesn't work

        // ArrayList requires a class type and doesn't work with primitive types
        // Could create your own class of each type and use that but it gets a bit messy
        // Autoboxing solves this

        Integer integer = new Integer(54); // Integer is a class, int is a primitive type
        // Integer is a wrapper - essentially a class around a primitive type with getter, setters and constructors

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();//this does work

        for (int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i)); // this part is autoboxing, converting int primitive type into Integer wrapper class
        }

        for (int i=0; i<=10; i++){
            System.out.println(i + " ---> " + intArrayList.get(i).intValue()); // this is unboxing, reversing the conversion
        }

        // autoboxing and unboxing shortcuts
        Integer myValue = 56; // is the same at compile time as Integer.valueOf(56);
        int myInt = myValue; // at compile time is myValue.intValue();

        ArrayList<Double> myDouble = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10; dbl+=0.5){
            myDouble.add(Double.valueOf(dbl)); // this will still work without Double.valueOf
        }
        for(int i=0; i<myDouble.size(); i++){
            double value = myDouble.get(i).doubleValue(); // this will still work without doubleValue()
            System.out.println(i + " ---> " + value);
        }
    }
}
