
public class HonorsStudent extends Student {

	public HonorsStudent(String name) {
		super(name);
	}
	
	public void addClass(boolean pass, int credits) {
		if (pass) {
			addClass(getGPA(), credits);
		} else {
			addClass(0, credits);
		}
	}
	
	public void addClass(double grade, int credits) {
		if (grade==-1) {
			addClass(false, credits);
		} else if (grade==-2) {
			addClass(true, credits);
		} else {
			super.addClass(grade, credits);
		}
	}
}
