public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(NumberOfDaysInMonth.getDaysMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysMonth(1, -2020));

    }
}
