public class App {
    public static void main(String[] args) throws Exception {


        // want to loop until something becomes true

        int count=0;
        while (count!=5) {
            System.out.println("count value is " + count);
            count++;
        }

        count = 0;
        while(true) {
            if (count==5) {
                break;
            }
            System.out.println("count value is " + count);
            count++;
        }

        count = 0; // if count = 5 then it will enter the loop infinitely because count is checking for values > 5
        // with a do-while loop it will always execute at least once
        do {
            System.out.println("count value is " + count);
            count++;
        } while (count!=5);


        int number=4;
        int finishNumber=20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)){
                continue;// allows the loop to continue without executing the rest of the code inside the loop at this iteration
            }
            System.out.println("even number " + number);
        }

    }

    public static boolean isEvenNumber(int number) {
        if ((number%2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
