import java.util.Arrays;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        //read in integers from sysin and return a sorted array from highest to lowest

        int[] myArray = getIntegers(5);
        myArray = sortArray(myArray);
        printArray(myArray);
    }

    public static int[] getIntegers(int number){
        int[] newArray = new int[number];
        System.out.println("Enter " + number + " integer values.\r"); // r starts a new line
        for (int i=0; i<newArray.length; i++){
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i=0; i<sortedArray.length; i++){
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int j=i; j<sortedArray.length; j++){
                if (sortedArray[j] > max){
                    index = j;
                    max = sortedArray[j];
                }
            }
            int temp = sortedArray[i];
            sortedArray[i] = max;
            sortedArray[index] = temp;
        }
        return sortedArray;

    }


}


