public class App {
    public static void main(String[] args) throws Exception {

        // polymorphism allows different behaviour depending on the class that is passed
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                                " : " + movie.getName() + "\n" + 
                                "Plot: " + movie.plot() + "\n");
        }
        // the plots are all printed out regardless of using keyword override, or having an overriding function

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 4) + 1;// random returns 0-1, multiply by 4 = 0-4, +1 gives random
                                                         // number 1-4
        System.out.println("Random number = " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependanceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgetable();
        }
        return null;

    }
}

// don't need keyword private when defining class without its own file
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    // not using override here
    public String plot() {
        return "A shark eats people";
    }
}

class IndependanceDay extends Movie {
    public IndependanceDay() {
        super("Independance Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to invade earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // no plot method
}

