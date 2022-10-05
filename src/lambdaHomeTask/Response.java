package predicateTest;

public class Response {
	/* Pre Conditions
	- Define a Product class with name, price, category, grade
	- Define a Response class with response body, status code, response type */
	
	String responsebody;
	int statuscode;
	String responsetype;
	public Response(String responsebody, int statuscode, String responsetype) {
		super();
		this.responsebody = responsebody;
		this.statuscode = statuscode;
		this.responsetype = responsetype;
	}
	public String getResponsebody() {
		return responsebody;
	}
	public void setResponsebody(String responsebody) {
		this.responsebody = responsebody;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getResponsetype() {
		return responsetype;
	}
	public void setResponsetype(String responsetype) {
		this.responsetype = responsetype;
	}
}
