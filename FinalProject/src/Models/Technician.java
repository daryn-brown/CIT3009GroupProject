package Models;

public class Technician extends User{
	
	//Attributes
	private int techStaffID;
	private String availability;
	
	
	//Default  Constructor
	public Technician()
	{
		super();
		techStaffID = 0000;
		availability = "YES/NO";
	}
	
	//Parameterized Constructor
	public Technician(int techStaffID, int userID, String firstName, String lastName, String email, String contactNum, String password, String availability)
	{
		super(userID, firstName, lastName, email, contactNum, password);
		this.techStaffID = techStaffID;
		this.availability = availability;
	}

	//Setters & Getters || Mutators & Accessors
	public int getTechStaffID() {
		return techStaffID;
	}

	public void setTechStaffID(int techStaffID) {
		this.techStaffID = techStaffID;
	}
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	//toString
	@Override
	public String toString() {
		return "Technician [techStaffID=" + techStaffID + ", availability=" + availability + ", getUserID()="
				+ getUserID() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getEmail()=" + getEmail() + ", getContactNum()=" + getContactNum() + ", getPassword()="
				+ getPassword() + "]";
	}
}
