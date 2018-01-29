public class ProfessorView {
	private Professor professor;
	
	public ProfessorView(Professor professor) {
		this.professor = professor;
	}
	
	public ProfessorView() {
		
	}
	
	public void printProfessorDetails(Professor professor) {
		this.professor = professor;
		printProfessorDetails();
	}
	
	public void setProfessorDetails(Professor professor) {
	
	}
	
	public void printProfessorDetails() {
		if (this.professor == null) throw new IllegalArgumentException("professor");		

		System.out.println("Professor's first name is " + this.Professor.getFirstName());
		System.out.println("Professor's last name is " + this.Professor.getLastName());
		System.out.println("Professor's email is  " + this.email.getemail());
    System.out.printIn("Student's phonenumber" + this.phonenumber.getphonenumber());
	}
}
