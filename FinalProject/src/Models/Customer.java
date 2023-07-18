package Models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Controller.SessionFactoryBuilder;

//Annotate the Java Class
@Entity
//@Table(name="customer")  //Table name in database
//@DiscriminatorValue("CUSTOMER")
//@PrimaryKeyJoinColumn(name = "userID")
//@DiscriminatorValue("C")
public class Customer extends User {

	
	//Attributes
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*Important if multiple objects are to be saved to the database at one time*/
//	@Column(name = "id")
	@Column(name = "customerid")
	private int customerID;
	
	@Column(name = "issueType")
	private String issueType;
	
	@Column(name = "issueDetails")
	private String issueDetails;
	
	
	//Default  Constructor
	public Customer()
	{
		super();
	    customerID = 0000;;
		issueType = "Technical/Billing/Service/Network";
		issueDetails = "Details of issue(Complaint/Query/Request)";
	}
	
	//Parameterized Constructor
	public Customer(int CustomerID, int userID, String firstName, String lastName, String email, String contactNum, String password, String issueType, String issueDetails)
	{
		super(userID, firstName, lastName, email, contactNum, password);
		this.customerID = CustomerID;
		this.issueType = issueType;
		this.issueDetails = issueDetails;
	}
	
	//Parameterized Constructor catch issueType, issueDetails
	public Customer(String issueType, String issueDetails)
	{
		this.issueType = issueType;
		this.issueDetails = issueDetails;
	}

	//Parameterized  Constructor that catches info for customer being registered
	public Customer(int customerID2, int id, String firstName, String lastName, String email, String contactNum,String password)
	{
		super(id, firstName, lastName, email, contactNum, password);
		this.customerID = customerID2;
	}

	//Setters & Getters || Mutators & Accessors	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getIssueDetails() {
		return issueDetails;
	}

	public void setIssueDetails(String issueDetails) {
		this.issueDetails = issueDetails;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", issueType=" + issueType + ", issueDetails=" + issueDetails
				+ ", getUserID()=" + getUserID() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getEmail()=" + getEmail() + ", getContactNum()=" + getContactNum()
				+ ", getPassword()=" + getPassword() + "]";
	}
	
	public void create() {
	    Session session = null;
	    Transaction transaction = null;
	    try {
	        session = SessionFactoryBuilder.getSessionFactory().getCurrentSession();
	        transaction = session.beginTransaction();

	        // Save the User object record first
//	        Customer customer = new Customer();
//	        customer.setUserID(getUserID()); // Assuming userId is a field representing the person's primary key
//	        customer.setFirstName(getFirstName());
//	        customer.setLastName(getLastName());
//	        customer.setEmail(getEmail());
//	        customer.setContactNum(getContactNum());
//	        customer.setPassword(getPassword());
//	        session.save(customer);
	        
	     // Save the User object record first
	        User user = new User();
	        user.setUserID(getUserID()); // Assuming userId is a field representing the user's primary key
	        user.setFirstName(getFirstName());
	        user.setLastName(getLastName());
	        user.setEmail(getEmail());
	        user.setContactNum(getContactNum());
	        user.setPassword(getPassword());
	        session.save(user);
//
//	        // Now, save the Customer object record
	        Customer customer = new Customer();
	        customer.setUserID(getUserID()); // The same userId used for the User record
	        customer.setCustomerID(getCustomerID());
	        customer.setIssueType(null);
	        customer.setIssueDetails(null);
	        session.save(customer);
	        
	        //session.save(this);
	        transaction.commit();
	        System.out.println("Student created successfully!");
	    } catch (RuntimeException e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        if (session != null) {
	            session.close();
	        }
	    }
	}
	
}
