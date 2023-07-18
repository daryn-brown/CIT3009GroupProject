package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="representative")  //Table name in database
public class Representative extends User{

	//Attributes
	@Column(name = "repStaffID")
	private int repStaffID;
	
	//Default  Constructor
	public Representative()
	{
		super();
		repStaffID = 0000;
	}
		
	//Parameterized Constructor
	public Representative(int repStaffID, int userID, String firstName, String lastName, String email, String contactNum, String password)
	{
		super(userID, firstName, lastName, email, contactNum, password);
		this.repStaffID = repStaffID;
	}

	//Setters & Getters || Mutators & Accessors
	public int getRepStaffID() {
		return repStaffID;
	}

	public void setRepStaffID(int repStaffID) {
		this.repStaffID = repStaffID;
	}

	//toString
	@Override
	public String toString() {
		return "Representative [repStaffID=" + repStaffID + ", getUserID()=" + getUserID() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()=" + getEmail()
				+ ", getContactNum()=" + getContactNum() + ", getPassword()=" + getPassword() + "]";
	}

	
}
