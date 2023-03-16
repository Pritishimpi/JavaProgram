package SortCustomclassusing_Comparable;

public class Student implements Comparable<Student> {
	
	private int rollno;
	private String name;
	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return this.rollno-o.rollno;
		return this.name.compareTo(o.name);
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
