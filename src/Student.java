
public class Student {
	private String firstName;
	private String lastName;
	private int idNumber;
        private String email;
        private String courses;
	
	public Student(String firstName, String lastName, int idNumber, String email, String courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
                this.email = email;
                this.courses = courses;
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
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}	
       
        public String getemail() {
             return this.email;
	}
         
        public String setemail(String email) {
             this.email = email;
	}

        public String getcourses() {
             return this.courses;
	}
         
        public String setcourses(String courses) {
             this.courses = courses;
	}
	
}
