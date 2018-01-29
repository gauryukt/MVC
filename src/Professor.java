public class Professor {
	private String firstName;
	private String lastName;
  private String email;
  private int phonenumber;
	
	public Student(String firstName, String lastName, String email , int phonenumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
    this.phonenumber = phonenumber;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
        
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
       
    public String getemail() {
       return this.email;
	}
         
    public String setemail(String email) {
       this.email = email;
	}

    public int phonenumber() {
      return this.phonenumber;
	}
         
    public int setphonenumber(String phonenumber) {
             this.phonenumber = phonenumber;
	}
	
}
