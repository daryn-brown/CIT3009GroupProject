package Models;

public class Representative extends Employee{


    //default constructor
    public Representative(){
        super();
    }
    //primary constructor
    public Representative(int userID, String firstName, String lastName, String password, String jobTitle) {
        super(userID, firstName, lastName, password, jobTitle);
    }
    //copy constructor
    public Representative(Representative rep){
        super(rep);
    }
}
