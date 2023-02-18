package comparto;

public class Student {

	private int id;
	private String name;
	private int empid;
	public Student(int id, String name, int empid) {
		super();
		this.id = id;
		this.name = name;
		this.empid = empid;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", empid=" + empid + "]";
	}

	
}
