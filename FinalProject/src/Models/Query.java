package Models;

public class Query extends Issue {
	//Attributes
	//private int queryID; // Automatcally generated in database
	private String queryType;
	private String queryDetails;
	
	//Default Constructor
	public Query() 
	{
		//queryID = 0;//Generated automatically in database
		queryType = "Technical/Billing/Service/Network";
		queryDetails = "Details of issue(Query)";
	}
	//Parameterized Constructor
	public Query(String queryType, String queryDetails, String issueDate, String issueType, String issueDetails, String issueStatus) {
		super(issueType, issueDetails, issueDate, issueStatus);
		this.queryType = queryType;
		this.queryDetails = queryDetails;
	}
	
	//Setters & Getters || Mutators & Accessor	
	public String getQueryType() {
		return queryType;
	}
	
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	
	public String getQueryDetails() {
		return queryDetails;
	}
	
	public void setQueryDetails(String queryDetails) {
		this.queryDetails = queryDetails;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Query [queryType=" + queryType + ", queryDetails=" + queryDetails + ", getIssueType()=" + getIssueType()
				+ ", getIssueDetails()=" + getIssueDetails() + ", getIssueDate()=" + getIssueDate()
				+ ", getIssueStatus()=" + getIssueStatus() + "]";
	}
}
