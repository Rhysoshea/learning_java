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
    }
}
