
public class TestClass {

	public static void main(String[] args) {
		Employee a = new Employee();
		a.emp_id=1000;
		Employee.empCount=20;
		
		System.out.println(a.emp_id);
		System.out.println(Employee.empCount);
		
		Employee b = new Employee();
		System.out.println(b.emp_id);//0
		System.out.println(Employee.empCount);//20
	}

}
