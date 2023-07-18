package Models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;

@Entity
@Table(name="users")  //Table name in database
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "user_type")
//@DiscriminatorValue("U")
//@DiscriminatorColumn(name = "userID", discriminatorType = DiscriminatorType.STRING)
public class User {

	//Attributes
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*Important if multiple objects are to be saved to the database at one time*/
	@Column(name = "userID")
	private int userID;
	
	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Last_Name")
	private String lastName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Contact_Number")
	private String contactNum;
	
	@Column(name = "Password")
	private String password;
	
	//Default  Constructor
	public User()
	{
		userID = 0000;
		firstName = "Firstname";
		lastName = "Lastname";
		email = "someemail@example.com";
		contactNum = "(000)-000-0000";
		password = "[0-1][a-z][A-Z]";
		
	}

		
	//Parameterized Constructor
	public User(int userID, String firstName, String lastName, String email, String contactNum, String password) 
	{
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNum = contactNum;
		this.password = password;
	}

	//Setters & Getters || Mutators & Accessors
	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactNum() {
		return contactNum;
	}


	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contactNum=" + contactNum + ", password=" + password + "]";
	}
	

	
}
