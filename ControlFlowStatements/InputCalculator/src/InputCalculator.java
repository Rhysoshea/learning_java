import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        double total=0;
        long avg=0;
        int count=0;

        while (true) {
            // System.out.println("Enter number");
            boolean isValidInt = scanner.hasNextInt();
            if (isValidInt) {
                int newNumber = scanner.nextInt();
                total+=newNumber;
                count++;

            } else {
                break;
            }
            scanner.nextLine();
        }
        avg = (long) Math.round(total/count);
        long totalPrint = (long) total;
        System.out.println("SUM = " + totalPrint + " AVG = " + avg);
        scanner.close(); 
    }
}
