
public class Student {
	private String firstName;
	private String lastName;
	private int idNumber;
        private char email;
        private char courses;
	
	public Student(String firstName, String lastName, int idNumber, char email, char courses) {
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
       
        public char getemail() {
             return this.email;
	}
         
        public char setemail(char email) {
             this.email = email;
	}

        public char getcourses() {
             return this.courses;
	}
         
        public char setcourses(char courses) {
             this.courses = courses;
	}
	
}
