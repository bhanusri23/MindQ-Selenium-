
public class TestEmpClass {

	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println(obj.emp_id);
		
		obj.getEmpSal();
		
		System.out.println(Employee.empCount);
		Employee.getEmpName();
		
		
	}

}
