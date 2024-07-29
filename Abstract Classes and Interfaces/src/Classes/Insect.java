package Classes;

public abstract class Insect extends Creature {
    // attributes
    private int numberOfLegs;
    private boolean hasWings;

    // constructors
    public Insect () {}
    public Insect ( String new_name, int new_age, String new_species, int new_numberOfLegs, boolean new_hasWings ) {
        this.setName( new_name );
        this.setAge( new_age );
        this.setSpecies( new_species );
        this.numberOfLegs = new_numberOfLegs;
        this.hasWings = new_hasWings;
    }

    // accessors
    public int getNumberOfLegs () {
        return numberOfLegs;
    }
    public boolean getHasWings () {
        return hasWings;
    }

    // mutators
    public void setNumberOfLegs ( int new_numberOfLegs ) {
        this.numberOfLegs = new_numberOfLegs;
    }
    public void setHasWings ( boolean new_hasWings ) {
        this.hasWings = new_hasWings;
    }

    // other methods


}
