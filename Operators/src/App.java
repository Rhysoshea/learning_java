public class App {
    public static void main(String[] args) throws Exception {

        // operator is a special symbol that is used on variables
        // operand is used to describe any object manipulated by an operator
        // expression is formed by combining variables, literals, methods and return values

        int result = 1+2; // 1 and 2 are operands, + and = are operators, 1+2 is an expression
        // = is an assigning operator 
        System.out.println("1+2= " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println("3 -1 = " + result);
        System.out.println("previousResult = " + previousResult);
        // previousResult is independent to result after being assigned to result


        // modulus / remainder operator
        result = result % 3; // gives remainder of result/3
        System.out.println("remainder " + result);

        // abbreviating operators
        result++; // +1
        result--; //-1
        result += 2; // +2
        result*=10; //result*10
        result/=10; //result/10


        boolean isAlien = false; //assignment operator
        if (isAlien == false) // equality operator
            System.out.println("it is not an alien");

        // good to use code blocks, otherwise only one line can be executed after if statement
        if (isAlien == false){ // equality operator
            System.out.println("it is not an alien");
            System.out.println("and I am scared of aliens");
        }

        int topScore = 80;
        if (topScore != 100) { //not equal to operator
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <100) {
            System.out.println("Greater than second top score and less than 100");
        }
        // single & is a bitwise operator for AND
        // && performs two operator checks, operates on boolean

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }
        // | is bitwise OR operator
        // || is logical OR operator, operates on boolean

        boolean isCar = false;
        // if (isCar = true) { // even though this isn't the correct ==, this is working because it returns a boolean when isCar is being assigned to true
        //     System.out.println("This is not supposed to happen");
        // }
        if (!isCar) { // ! is a logical compliment operator and tests the alternative value of the boolean
            System.out.println("This is not a car");
        }

        // ternary operator
        // is a shortcut to assigning one of two values to a variable depending on a condition
        // eg. int ageOfClient = 20
        // boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        // isEighteenOrOver becomes true
        // was Car becomes true if isCar is true, otherwise it will be assigned false
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("was Car is true");
        }

        // operator challenge
        // create a double with value 20.00
        // create a variable of double with val 80.00
        // add both variables together and multiply by 100
        // get the remainder of result with 40
        // create a bool that assigns true if remainder is 0
        // output the boolean
        // write an if then statement that displays "got some remainder" if boolean is not true

        double firstVal = 20.00;
        double secondVal = 80.00;
        double thirdValue = (firstVal + secondVal ) * 100.00;
        double remain = thirdValue % 40.00;
        System.err.println("remainder: " + remain);
        boolean noRemain = (remain == 0) ? true : false;
        if (!noRemain) {
            System.err.println("Got some remainder");
        }


    }
}
