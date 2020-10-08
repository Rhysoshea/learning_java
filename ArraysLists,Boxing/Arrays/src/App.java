import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int[] myIntArray = new int[10]; //creates an empty array of length 10
        // myIntArray[5] = 50;
        // int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; //creates an array of length 10 with all values specified
        // double[] myDoubleArray = new double[10];
        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);

        int[] myInputArray = getIntegers(5);
        printArray(myInputArray);

        System.out.println("The average is " + getAverage(myInputArray));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r"); // r starts a new line
        int[] values = new int[number];

        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double)array.length;
    }

}
