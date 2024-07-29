package Classes;

import Interfaces.Sound;

abstract class Human extends Creature implements Sound {
    // attributes
    private String job;

    // constructors
    public Human () {}
    public Human ( String new_name, int new_age, String new_species, String new_job ) {
        super( new_name, new_age, new_species );
        this.job = new_job;
    }

    // accessors
    public String getJob () {
        return job;
    }

    // mutators
    public void setJob ( String new_job ) {
        this.job = new_job;
    }

    // other methods
    public String talk () {
        return "talking";
    }

    // interface methods
    @Override
    public String sound () {
        return "talking";
    }

}
