package Models;

public class Employee extends User{

    //attributes
    private String jobTitle;

    //default constructor
    public Employee(){
        super();
        this.jobTitle = " default title";
    }
    //primary constructor
    public Employee(int userID, String firstName, String lastName, String password, String jobTitle) {
   //     super(userID, firstName, lastName, password);
        this.jobTitle = jobTitle;
    }
    //copy constructor
    public Employee(Employee emp){
        
        this.jobTitle = emp.getJobTitle();
    }

    //getters and setters
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
