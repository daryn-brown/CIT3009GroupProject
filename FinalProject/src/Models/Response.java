package Models;

public class Response {

	//Attributes
	//private int responseID; // Automatcally generated in database
	private String responseText;
	private String lastResponseDate;// Change to Date Composition
	
	//Default Constructor
	public Response()
	{
		responseText = "We have responded.";
		lastResponseDate = "2023-07-02";//Change to Date("0","0","0")
	}
	
	//Parameterized Constructor
	public Response(String responseText, String lastResponseDate) 
	{
		this.responseText = responseText;
		this.lastResponseDate = lastResponseDate;
	} 
	
	//Setters & Getters || Mutators & Accessors
	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public String getLastResponseDate() {
		return lastResponseDate;
	}

	public void setLastResponseDate(String lastResponseDate) {
		this.lastResponseDate = lastResponseDate;
	}
	
	//toString
	@Override
	public String toString() {
		return "Response [responseText=" + responseText + ", lastResponseDate=" + lastResponseDate + "]";
	}
}
