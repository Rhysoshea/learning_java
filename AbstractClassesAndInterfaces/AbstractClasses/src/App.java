public class App {
    public static void main(String[] args) throws Exception {

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        // can't instantiate type Bird directly because it is an abstract class. Has to be done through another class. Parrot in this case
    }
}
