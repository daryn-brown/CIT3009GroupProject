package Models;

public class Request extends Issue{

	//Attributes
	//private int requestID; // Automatcally generated in database
	private String requestType;
	private String requestDetails;
	
	//Default Constructor
	public Request()
	{
		//requestID = 0;//Generated automatically in database
		requestType = "Technical/Billing/Service/Network/DeleteCustomer";
		requestDetails = "Details of issue(Request)";
	}

	//Parameterized Constructor
	public Request(String requestType, String requestDetails, String issueType, String issueDetails, String issueDate, String issueStatus) 
	{
		super(issueType, issueDetails, issueDate, issueStatus);
		this.requestType = requestType;
		this.requestDetails = requestDetails;
	}

	//Setters & Getters || Mutators & Accessors
	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestDetails() {
		return requestDetails;
	}

	public void setRequestDetails(String requestDetails) {
		this.requestDetails = requestDetails;
	}

	
	//toString
	@Override
	public String toString() {
		return "Request [requestType=" + requestType + ", requestDetails=" + requestDetails + ", getIssueType()="
				+ getIssueType() + ", getIssueDetails()=" + getIssueDetails() + ", getIssueDate()=" + getIssueDate()
				+ ", getIssueStatus()=" + getIssueStatus() + "]";
	}
}
