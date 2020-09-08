public class App {
    public static void main(String[] args) {

        // string is not a primitive type
        // it is a class but is used quite often and treated as primitive
        // string is a sequence of characters
        // technically limited by the heap space in the computer or max_int

        String myString = "This is a string";
        System.out.println("myString is = " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is = " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95"; //treats it as text
        System.out.println(numberString); 

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // adding numeric to string by converting to string
        System.out.println("LastString = " + lastString); 

        // strings in Java are immutable - can't change it after it's created, instead Java creates a new string and discards the old one from memory
    }
}
