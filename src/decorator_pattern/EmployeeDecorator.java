package decorator_pattern;

public abstract class EmployeeDecorator implements EmployeeComponent {
    protected EmployeeComponent employeeComponent;

    public EmployeeDecorator(EmployeeComponent employeeComponent) {
        this.employeeComponent = employeeComponent;
    }

    @Override
    public void doTask() {
        employeeComponent.doTask();
    }
}
