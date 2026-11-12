

public class Student implements Comparable<Student>{

	private String name;
	private int likeable;
	
	public Student (String n, int l) {
		name = n;
		likeable = l;
		
	}
	
	public String toString() {
		return "Name: " + name + " (" + likeable + ")";
	}

	@Override
	public int compareTo(Student o) {
		if (this.likeable == o.likeable) {
			return this.name.compareTo(o.name);
		}
		
		return this.likeable - o.likeable;
	}
}
