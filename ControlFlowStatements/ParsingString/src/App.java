public class App {
    public static void main(String[] args) throws Exception {

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);
        
        // using an Integer wrapper
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
    
        numberAsString += 1; // will cast the integer to a string and add it to the end of the string
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        numberAsString = "2018.125";

        // using an Double wrapper
        double num = Double.parseDouble(numberAsString);
        System.out.println("number = " + num);

        numberAsString += 1; // will cast the integer to a string and add it to the end of the string
        num += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + num);

    }

}
