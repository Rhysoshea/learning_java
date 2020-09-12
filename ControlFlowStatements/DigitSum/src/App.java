public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(32123));

    }

    public static int sumDigits(int number) {
        if (number < 10){
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            sum += number%10;
            number /= 10;
        }

        return sum;

    }
}
