package pluralsight.singleResposibilityPrinciple.before.hr.main;




import pluralsight.singleResposibilityPrinciple.before.hr.persistence.EmployeeRepository;
import pluralsight.singleResposibilityPrinciple.before.hr.personnel.Employee;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            Employee.save(e);
        }
    }
}
