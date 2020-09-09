public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 3));
        System.out.println(BarkingDog.shouldWakeUp(true, 12));
        System.out.println(BarkingDog.shouldWakeUp(true, 25));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));

    }
}
