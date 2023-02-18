package comrablecomaptro;

import java.util.Comparator;



public class Emp implements Comparable<Emp> {

	private int id;
	private String name;
	private int empid;
	public Emp(int id, String name, int empid) {
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
		return "Emp [id=" + id + ", name=" + name + ", empid=" + empid + "]";
	}
	@Override
	public int compareTo(Emp o) {
		if(id==o.id)
		return 0;
		else if(id>o.id)
			return 1;
		else
			return -1;
	}

	}
	

