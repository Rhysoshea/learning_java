import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] oddArray = {1,2,3,4,5};
        System.out.println("Original : " + Arrays.toString(oddArray));
        reverseArray(oddArray);
        System.out.println("Reversed : " + Arrays.toString(oddArray));

        int[] evenArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original : " + Arrays.toString(evenArray));
        reverseArray(evenArray);
        System.out.println("Reversed : " + Arrays.toString(evenArray));
    }


    public static void reverseArray(int[] array){
        int i = 0;
        int j = array.length-1;

        while (i<j) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            i++;
            j--;
        }
    }
}
