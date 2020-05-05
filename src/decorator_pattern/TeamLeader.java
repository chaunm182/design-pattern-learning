package decorator_pattern;

public class TeamLeader extends EmployeeDecorator {
    public TeamLeader(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    @Override
    public void doTask() {
        super.doTask();
        planning();
    }

    public void planning(){
        System.out.println("Team member planning");
    }
}
