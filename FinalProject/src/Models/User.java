/* Author(s):David Walker
 * Class: User.java
 * 
 * */
package Models;

public class User {
	
	//Attributes
	private int userID;
	private String firstName;
	private String lastName;
	private String password;
	
	//Default Constructor
	public User()
	{
		userID = 0000;
		firstName = "Firstname";
		lastName = "Lastname";
		password = "[A-Z][a-z]0-9";
	}

	//Primary Constructor
	public User(int userID, String firstName, String lastName, String password)
	{
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//toString
	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + "]";
	}
	
	
	
	
	
}
