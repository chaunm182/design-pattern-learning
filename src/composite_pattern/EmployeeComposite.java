package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposite implements Employee{

    private List<Employee> employees;

    public EmployeeComposite() {
        employees = new ArrayList<>();
    }

    @Override
    public void showDetails() {
        for(Employee employee : employees){
            employee.showDetails();
        }
    }

    public void addEmp(Employee employee){
        employees.add(employee);
    }
    public void removeEmp(Employee employee){
        employees.remove(employee);
    }
}
