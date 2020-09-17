import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int min=0;
        int max=0;
        boolean firstInput = true;

        while (true) {
            System.out.println("Enter number");
            boolean isValidInt = scanner.hasNextInt();
            if (isValidInt) {
                int newNumber = scanner.nextInt();
                if (firstInput){
                    min=newNumber;
                    max=newNumber;
                    firstInput=false;
                }
                if (newNumber<min) {
                    min = newNumber;
                } else if (newNumber>max){
                        max = newNumber;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min : " +min + " and max: " + max);
        scanner.close();

    }
}
