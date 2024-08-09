import Classes.*;

public class Main {
    public static void main(String[] args) {
        // Testing Programmer class
        Programmer programmer = new Programmer("Alice", 30, "Human", "Software Engineer", "Java", 10);
        System.out.println("Programmer");
        System.out.println("Name: " + programmer.getName());
        System.out.println("Age: " + programmer.getAge());
        System.out.println("Species: " + programmer.getSpecies());
        System.out.println("Job: " + programmer.getJob());
        System.out.println("Programming Language: " + programmer.getProgrammingLanguage());
        System.out.println("Years of Experience: " + programmer.getYearsOfExperience());
        System.out.println("    Special Ability Code: " + programmer.code());
        System.out.println("        Interface Eat: " + programmer.eat());
        System.out.println();

        // Testing Soldier class
        Soldier soldier = new Soldier("Bob", 28, "Human", "Infantry", "Sergeant");
        System.out.println("Soldier");
        System.out.println("Name: " + soldier.getName());
        System.out.println("Age: " + soldier.getAge());
        System.out.println("Species: " + soldier.getSpecies());
        System.out.println("Job: " + soldier.getJob());
        System.out.println("Rank: " + soldier.getRank());
        System.out.println("    Special Ability March: " + soldier.march());
        System.out.println("        Interface Swim: " + soldier.swim());
        System.out.println("        Interface Attack: " + soldier.attack());
        System.out.println("        Interface Eat: " + soldier.eat());
        System.out.println();

        // Testing Turtle class
        Turtle turtle = new Turtle("Shelly", 50, "Pond", "Reptile");
        System.out.println("Turtle");
        System.out.println("Name: " + turtle.getName());
        System.out.println("Age: " + turtle.getAge());
        System.out.println("Species: " + turtle.getSpecies());
        System.out.println("Habitat: " + turtle.getHabitat());
        System.out.println("    Special Ability Hide: " + turtle.hide());
        System.out.println("        Interface Swim: " + turtle.swim());
        System.out.println("        Interface Eat: " + turtle.eat());
        System.out.println();

        // Testing Pigeon class
        Pigeon pigeon = new Pigeon("Percy", 5, "Urban", "Bird");
        System.out.println("Pigeon");
        System.out.println("Name: " + pigeon.getName());
        System.out.println("Age: " + pigeon.getAge());
        System.out.println("Species: " + pigeon.getSpecies());
        System.out.println("Habitat: " + pigeon.getHabitat());
        System.out.println("    Special Ability Nest: " + pigeon.nest());
        System.out.println("        Interface Sound: " + pigeon.sound());
        System.out.println("        Interface Fly: " + pigeon.fly());
        System.out.println("        Interface Eat: " + pigeon.eat());
        System.out.println();

        // Testing Ladybug class
        Ladybug ladybug = new Ladybug("Lila", 1, "Insect", 6, true, "Red", 7);
        System.out.println("Ladybug");
        System.out.println("Name: " + ladybug.getName());
        System.out.println("Age: " + ladybug.getAge());
        System.out.println("Species: " + ladybug.getSpecies());
        System.out.println("Color: " + ladybug.getColor());
        System.out.println("Number of Spots: " + ladybug.getNumberOfSpots());
        System.out.println("    Special Ability Crawl: " + ladybug.crawl());
        System.out.println("        Interface Fly: " + ladybug.fly());
        System.out.println("        Interface Eat: " + ladybug.eat());
        System.out.println();

        // Testing Spider class
        Spider spider = new Spider("Spidey", 2, "Arachnid", 8, true, true);
        System.out.println("Spider");
        System.out.println("Name: " + spider.getName());
        System.out.println("Age: " + spider.getAge());
        System.out.println("Species: " + spider.getSpecies());
        System.out.println("Is Venomous: " + spider.getIsVenomous());
        System.out.println("    Special Ability Make Web: " + spider.makeWeb());
        System.out.println("        Interface Attack: " + spider.attack());
        System.out.println("        Interface Eat: " + spider.eat());
    }
}
