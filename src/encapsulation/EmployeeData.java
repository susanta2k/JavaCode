package encapsulation;

// Encapsulation is called as data hiding 
// Encapsulation means binding data with method. For assigning or getting output we have use methods (get and set)

public class EmployeeData {
	
	private int ssn;
	private int empId;
	private String name;
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		EmployeeData emp = new EmployeeData();
		emp.setEmpId(123);
		emp.setSsn(1323123123);
		emp.setName("Tom");
		
		System.out.println(emp.empId);
		System.out.println(emp.ssn);
		System.out.println(emp.name);
		
		}

}
