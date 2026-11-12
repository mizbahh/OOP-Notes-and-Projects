
public class Runner {

	public static void main(String[] args) {
		Student adam = new Student("Adam");
		HonorsStudent eileen=new HonorsStudent("Eileen");
		StudentAthlete chloe = new StudentAthlete("Chloe", "Valorant");
		
		adam.addClass(3.75, 3);
		adam.addClass(3.25, 3);
		adam.addClass(2,10);
		
		eileen.addClass(4.0, 3);
		eileen.addClass(false, 1);
		eileen.addClass(true, 10);
		
		Student eyelean = new HonorsStudent("New Eileen");
		eyelean.addClass(3.5, 5);
		eyelean.addClass(-2,1);
		
		
		// casts back down to a student
		eyelean = Student(eyelean);
		
		Student AyeLean = new Eileen();
		
		// get error because can't save parent to a child, can only save a child to a parent
		// HonorsStudent atom = Student("Adam");
		

		
		System.out.println(adam.getGPA());
		System.out.println(eileen.getGPA());
		System.out.println(eyelean.getGPA());

	}
}
