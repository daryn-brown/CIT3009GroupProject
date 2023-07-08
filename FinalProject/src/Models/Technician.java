package Models;

public class Technician extends Employee{

    //attributes
    private boolean availability;

    //default constructor
    public Technician(){
        super();
        availability = true;
    }
    //primary constructor
    public Technician(int userID, String firstName, String lastName, String password, String jobTitle, boolean availability) {
        super(userID, firstName, lastName, password, jobTitle);
        this.availability = availability;
    }
    //copy constructor
    public Technician(Employee emp){
        super(emp);
        
    }
    //mutator
    public boolean isAvailability() {
        return availability;
    }
}
