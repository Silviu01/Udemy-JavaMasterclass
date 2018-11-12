package com.Silviu.Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "kids escaping a maze";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over universe";
    }
}
class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
    //no plot
}

public class Main {
    public static void main(String[] args) {
        for(int i =1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1;    //math.random returns a double, therefore the cast.
                    // multiplying by 5, returns a number between 0 to 4, so add 1 to return 1 to 5;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
