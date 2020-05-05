package decorator_pattern;

public class Manager extends EmployeeDecorator {
    public Manager(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    @Override
    public void doTask() {
        super.doTask();
        assignTask();
        manageProgress();
    }

    public void assignTask(){
        System.out.println("Manager assign task");
    }

    public void manageProgress(){
        System.out.println("Manager manage progress");
    }
}
