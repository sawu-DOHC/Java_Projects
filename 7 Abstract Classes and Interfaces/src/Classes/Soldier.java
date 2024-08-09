package Classes;

import Interfaces.Attack;
import Interfaces.Swim;

public class Soldier extends Human implements Swim, Attack {
    // attributes
    private String rank;

    // constructors
    public Soldier () {}
    public Soldier ( String new_name, int new_age, String new_species, String new_job, String new_rank ) {
        super( new_name, new_age, new_species, new_job );
        this.rank = new_rank;
    }

    // accessors
    public String getRank () {
        return rank;
    }

    // mutators
    public void setRank ( String new_rank ) {
        this.rank = new_rank;
    }

    // other methods
    public String march () {
        return "starts marching";
    }

    // interface methods
    @Override
    public String swim () {
        return "swimms through mud";
    }
    @Override
    public String attack () {
        return "shoots you";
    }
    @Override
    public String eat () {
        return "eats military rations";
    }
}
