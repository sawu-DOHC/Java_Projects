package Classes;

import Interfaces.Swim;

public class Turtle extends Animal implements Swim {
    // attributes
    private String habitat;

    // constructors
    public Turtle(String new_name, int new_age, String new_habitat, String new_species) {
        this.setName(new_name);
        this.setAge(new_age);
        this.habitat = new_habitat;
        this.setSpecies(new_species);
    }

    // accessors
    public String getHabitat() {
        return habitat;
    }

    // mutators
    public void setHabitat(String new_habitat) {
        this.habitat = new_habitat;
    }

    // other methods
    public String hide() {
        return "hiding";
    }

    // interface methods
    @Override
    public String swim() {
        return "swimming slowly";
    }

    @Override
    public String eat() {
        return "eats a shrimp";
    }

}
