package Classes;

import Interfaces.Fly;
import Interfaces.Sound;

public class Pigeon extends Animal implements Sound, Fly {
    // attributes
    private String habitat;

    // constructors
    public Pigeon () {}
    public Pigeon ( String new_name, int new_age, String new_habitat, String new_species ) {
        this.setName( new_name );
        this.setAge( new_age );
        this.habitat = new_habitat;
        this.setSpecies( new_species );
    }

    // accessors
    public String getHabitat () {
        return habitat;
    }

    // mutators
    public void setHabitat ( String new_habitat ) {
        this.habitat = new_habitat;
    }

    // other methods
    public String nest () {
        return "nesting";
    }

    // interface methods
    @Override
    public String sound () {
        return "goo goo";
    }
    @Override
    public String fly (){
        return "flies super high";
    }
    @Override
    public String eat () {
        return "eats a worm";
    }
}
