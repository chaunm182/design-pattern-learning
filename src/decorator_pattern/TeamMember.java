package decorator_pattern;

public class TeamMember extends EmployeeDecorator {
    public TeamMember(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    @Override
    public void doTask() {
        super.doTask();
        performTask();
        coordinateWithOthers();
    }

    public void performTask(){
        System.out.println("Team member perform task");
    }

    public void coordinateWithOthers(){
        System.out.println("Team member coordinate with others");
    }
}
