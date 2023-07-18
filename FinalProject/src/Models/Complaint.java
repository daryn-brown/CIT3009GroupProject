package Models;

public class Complaint extends Issue{
	
	//Attributes
	//private int complaintID; // Automatcally generated in database
	private String complaintType;
	private String complaintDetails;
	
	//Default  Constructor
	public Complaint()
	{
		//complaintID = 0;//Generated automatically in database
		complaintType = "Technical/Billing/Service/Network";
		complaintDetails = "Details of issue(Complaint)";
	}
	
	
	//Parameterized Constructor 
	public Complaint(String complaintType, String complaintDetails,String issueType, String issueDetails, String issueDate, String issueStatus) {
		super(issueType, issueDetails, issueDate, issueStatus);
		//this.issueID = issueID;
		//this.complaintID = complaintID;
		this.complaintType = complaintType;
		this.complaintDetails = complaintDetails;
	}

	
	//Setters & Getters || Mutators & Accessors
	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getComplaintDetails() {
		return complaintDetails;
	}

	public void setComplaintDetails(String complaintDetails) {
		this.complaintDetails = complaintDetails;
	}

	@Override
	public String toString() {
		return "Complaint [complaintType=" + complaintType + ", complaintDetails=" + complaintDetails
				+ ", getIssueType()=" + getIssueType() + ", getIssueDetails()=" + getIssueDetails()
				+ ", getIssueDate()=" + getIssueDate() + ", getIssueStatus()=" + getIssueStatus() + "]";
	}

}
