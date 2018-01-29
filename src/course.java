public class Course {
	private String coursename;
	private int coursenumber;
  private int credit;
  private String professor;
	
	public Course(String coursename, int coursenumber, int credit, String professor) {
		this.coursename = coursename;
		this.coursenumber = coursenumber;
    this.credit = credit;
    this.professor = professor;

	}
	
	public String getcoursename() {
		return this.coursename;
	}
	
	public void setcoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
	public int getcoursenumber() {
		return this.coursenumber;
	}
	
	public void setcoursenumber(int coursenumber) {
		this.coursenumber = coursenumber;
	}	
       
  public int getcredit() {
     return this.credit = credit;
  }

  public void setcredit(int credit) {
     this.credit = credit;
 }

 public String getprofessor() {
    return this.professor = professor;
 }

 public String setprofessor(String professor) {
     this.professor = professor;
 }
