package Models;

public class Issue {

	//Attributes
	private String issueType;
	private String issueDetails;
	private String issueDate;// Change to Date Composition
	private String issueStatus;
	
	
	//Default  Constructor
	public Issue()
	{
		//issueID = 0;//Generated automatically in database
		issueType = "Technical/Billing/Service/Network";
		issueDetails = "Details of issue(Complaint/Query/Request)";
		issueDate = "2023-07-10";//Change to Date("0","0","0")
		issueStatus = "";
	}
	
	//Parameterized Constructor 
	public Issue(String issueType, String issueDetails, String issueDate, String issueStatus)
	{
		//this.issueID = issueID;
		this.issueType = issueType;
		this.issueDetails = issueDetails;
		this.issueDate = issueDate;
		this.issueStatus = issueStatus;
	}

	//Setters & Getters || Mutators & Accessors
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

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	//toString
	@Override
	public String toString() {
		return "Issue [issueType=" + issueType + ", issueDetails=" + issueDetails + ", issueDate=" + issueDate
				+ ", issueStatus=" + issueStatus + "]";
	}
	



}
