package SortCustomclassusing_Comparable;

public class Employee implements Comparable<Employee> {
	
	private int eid;
	private String name;
	private int age;
	private long salary;
	private long mono;

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		//return this.eid-emp.eid;
		return this.name.compareTo(emp.name);
		//return this.age-emp.age;
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getMono() {
		return mono;
	}

	public void setMono(long mono) {
		this.mono = mono;
	}
	

}
