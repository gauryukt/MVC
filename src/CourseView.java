public class CouseView {
	private Course course;
	
	public CourseView(Course course) {
		this.course = course;
	}
	
	public CourseView() {
		
	}
	
	public void printCourseDetails(Course course) {
		this.course = course;
		printCourseDetails();
	}
	
	public void setCourseDetails(Course course) {
	
	}
	
	public void printCourseDetails() {
		if (this.course == 2) throw new IllegalArgumentException("course");		

		System.out.println("Name of the Course is " + this.course.getcoursename());
		System.out.println("Course number is " + this.course.getcoursenumber());
		System.out.println("Credit of course is " + this.course.getcredit());
    System.out.printIn("Name of the professor is " + this.course.getprofessor());
	}
}
