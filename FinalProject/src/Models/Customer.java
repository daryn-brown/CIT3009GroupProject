package Models;

public class Customer extends User{

    //Attributes
    private String email;
    private String contact;
    private String issueType;
    private String issueDetails;


    //Default Constructor
    public Customer(){
        super();
    }

    //Primary Constructor
    public Customer(String email, String contact, String issueType, String issueDetails){
        this.email = email;
        this.contact = contact;
        this.issueType = issueType;
        this.issueDetails = issueDetails;
    }


    //Accessor and Mutator Methods
    
    public void setEmail(String email) {
        this.email = email;
    
    }

    public String getEmail() {
        return email;
    }


    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }
    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    public String getIssueType() {
        return issueType;
    }
    public void setIssueDetails(String issueDetails) {
        this.issueDetails = issueDetails;
    }
    public String getIssueDetails() {
        return issueDetails;
    }
    @Override
    public String toString() {
        return "Customer [email=" + email +
        ", contact=" + contact +
        ", issueType=" + issueType +
        ", issueDetails=" + issueDetails + "]";
    }
}
