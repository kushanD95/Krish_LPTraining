import EMS.Employee.Employee;
import EMS.Manager.Manager;

public class Application{
	public static void main(String[] args) {
		Employee emp = new Employee();
		Manager mngr = new Manager();

		emp.print();
		mngr.print();
	}
}