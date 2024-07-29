package Classes;

import Interfaces.Fly;

public class Ladybug extends Insect implements Fly {
    // attributes
    private String color;
    private int numberOfSpots;

    // constructors
    public Ladybug () {}
    public Ladybug ( String new_name, int new_age, String new_species, int new_numberOfLegs, boolean new_hasWings, String new_color, int new_numberOfSpots ) {
        super( new_name, new_age, new_species, new_numberOfLegs, new_hasWings );
        this.color = new_color;
        this.numberOfSpots = new_numberOfSpots;
    }

    // accessors
    public String getColor () {
        return color;
    }
    public int getNumberOfSpots () {
        return numberOfSpots;
    }

    // mutators
    public void setColor ( String new_color ) {
        this.color = new_color;
    }
    public void setNumberOfSpots ( int new_numberOfSpots ) {
        this.numberOfSpots = new_numberOfSpots;
    }

    // other methods
    public String crawl(){
        return "crawls around and looks cute";
    }

    // interface methods
    @Override
    public String fly () {
        if ( getHasWings() == true ) {
            return "flying";
        }
        else {
            return "cannot fly";
        }
    }
    @Override
    public String eat (){
        return "eats a leaf";
    }
}
