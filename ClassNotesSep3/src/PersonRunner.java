
public class PersonRunner {

	public static void main(String[] args) {
		Person p1 = new Person("Kyle");
		p1.ageGuy(10);
		System.out.println(p1.getName() + ": " + p1.getAge());
		System.out.println(Person.oldest);
	}

}
