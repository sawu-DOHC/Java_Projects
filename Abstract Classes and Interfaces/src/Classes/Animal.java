package Classes;


public abstract class Animal extends Creature {


    // attributes
    private String habitat;


    // constructors
    public Animal () {}
    public Animal ( String new_name, int new_age, String new_species, String new_habitat ) {
        this.setName( new_name );
        this.setAge( new_age );
        this.setSpecies( new_species );
        this.habitat = new_habitat;

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

}
