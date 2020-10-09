import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // reference types vs value types

        int myInt = 10; // single space in memory is used here
        int anotherInt = myInt; // the value of myInt is copied to another space in memory

        System.out.println("myInt " + myInt);
        System.out.println("anotherInt " + anotherInt);

        anotherInt++;

        System.out.println("myInt " + myInt);
        System.out.println("anotherInt " + anotherInt);

        int[] myIntArray = new int[5]; // this is a reference type, holds a reference to the address in memory but not the object itself
        int[] anotherArray = myIntArray; // this is a copy of the same reference, not using new keyword to create a new array

        System.out.println("myIntArray= " + Arrays.toString(myIntArray)); // converts each element in the array to a string and separates with a comma
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1; // changes both variables because they are pointing to the same allocated memory

        System.out.println("myIntArray= " + Arrays.toString(myIntArray)); 
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8}; // anotherArray is now dereferenced from the address that myIntArray points to and points to a new object
        modifyArray(myIntArray);

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray (int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; // array is now a parameter that points to a new object and doesn't affect the passed referenced object
    }
}
