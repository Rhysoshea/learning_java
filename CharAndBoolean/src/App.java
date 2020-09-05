public class App {
    public static void main(String[] args) throws Exception {

        char myChar = 'D'; // char uses '' string uses ""
        // char occupies 16 bits
        // not just a single byte as it allows to store unicode characters
        // unicode = international encoding standard
        // each letter, number or symbol is assigned a numeric value and we can represent other languages beyond English
        char myUnicode = '\u0044'; // unicode for D, need to use backslash u to specify unicode
        System.out.println(myChar);
        System.out.println(myUnicode);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);


        // boolean, yes/no, 1/0, true/false
         boolean myTrueBooleanValue = true;
         boolean myFalseBooleanValue = false;
         System.out.println();
    }
}
