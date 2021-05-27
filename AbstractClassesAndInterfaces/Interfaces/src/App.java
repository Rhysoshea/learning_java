public class App {
    public static void main(String[] args) throws Exception {
        // interfaces are another way to achieve abstraction
        // it groups related methods into empty bodies as seen in ITelephone
        // it is also common practice to use I before the interface name
        // the interface must be "implemented" (like inherited) by another class
        // can implement multiple interfaces by separating them with a comma

        ITelephone timsPhone; //using ITelephone instance here becomes useful later when using timsPhone again for a MobilePhone class
        // doing DeskPhone timsPhone still works but wouldn't be able to reuse later for MobilePhone
        timsPhone = new DeskPhone(144342);
        timsPhone.powerOn();
        timsPhone.callPhone(144342);
        timsPhone.answer();

        timsPhone = new MobilePhone(24521);
        timsPhone.powerOn();
        timsPhone.callPhone(24521);
        timsPhone.answer();
    }
}
