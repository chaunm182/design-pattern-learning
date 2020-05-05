package decorator_pattern;

public class EmployeeConreteComponent implements EmployeeComponent {
    @Override
    public void doTask() {
        System.out.println("Employee do task");
    }
}
