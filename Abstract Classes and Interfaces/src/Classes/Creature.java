package Classes;

import Interfaces.Eat;

abstract class Creature implements Eat {
    // attributes
    private String name;
    private int age;
    private String species;

    // constructors
    public Creature () {}
    public Creature ( String new_name, int new_age, String new_species ) {
        this.name = new_name;
        this.age = new_age;
        this.species = new_species;
    }

    // accessors
    public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }
    public String getSpecies () {
        return species;
    }

    // mutators
    public void setName ( String new_name ) {
        this.name = new_name;
    }
    public void setAge ( int new_age ) {
        this.age = new_age;
    }
    public void setSpecies ( String new_species ) {
        this.species = new_species;
    }

    // abstract methods
}
