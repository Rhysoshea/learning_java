import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Please enter count");
        int [] array = readIntegers(scanner.nextInt());

        System.out.println("Minimum value is :" + findMin(array));

    }


    public static int [] readIntegers(int count) {
        
        System.out.println("Enter " + count + " integers");
        int [] array = new int[count];
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
