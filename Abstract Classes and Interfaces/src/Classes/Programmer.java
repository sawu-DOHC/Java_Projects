package Classes;

public class Programmer extends Human {
    // attributes
    private String programmingLanguage;
    private int yearsOfExperience;

    // constructors
    public Programmer () {}
    public Programmer ( String new_name, int new_age, String new_species, String new_job, String new_programmingLanguage, int new_yearsOfExperience ) {
        super( new_name, new_age, new_species, new_job );
        this.programmingLanguage = new_programmingLanguage;
        this.yearsOfExperience = new_yearsOfExperience;
    }

    // accessors
    public String getProgrammingLanguage () {
        return programmingLanguage;
    }
    public int getYearsOfExperience () {
        return yearsOfExperience;
    }

    // mutators
    public void setProgrammingLanguage ( String new_programmingLanguage ) {
        this.programmingLanguage = new_programmingLanguage;
    }
    public void setYearsOfExperience ( int new_yearsOfExperience ) {
        this.yearsOfExperience = new_yearsOfExperience;
    }

    // other methods
    public String code () {
        return "writes bad code";
    }

    // interface methods
    @Override
    public String eat () {
        return "eating while coding";
    }
}
