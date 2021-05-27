import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int total = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (count<10) {
            System.out.println("Enter number #" + (count+1));
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int nextNum = scanner.nextInt();
                total += nextNum;
                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); //handles end of the line
            // without this line, if an invalid number is 
            // entered we'll enter an endless loop
        }

        System.out.println("Total : " + total);
        scanner.close();
    }
}
