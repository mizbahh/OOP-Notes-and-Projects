
public class Student {

	private String name;
	private double gpa;
	private int credits;
	private boolean graduated;
	
	public Student(String name) {
		this.name = name;
		gpa=0.0;
		credits = 0;
		graduated = false;
	}
	
	public void addClass (double grade, int credits) {
		double points = this.gpa * this.credits;
		points+=grade*credits;
		this.credits += credits;
		this.gpa = points/this.credits;
		
		if (this.credits>=120 && this.gpa>=2.0) {
			this.graduated=true;
		}
	}
}
