
public class employee {
	
	public int id;
	public String dept;
	public int salary;
	
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", dept=" + dept + ", salary=" + salary + "]";
	}
	public employee(int id, String dept, int salary) {
		super();
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
