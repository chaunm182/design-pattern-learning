package decorator_pattern;

public class Main {
    public static void main(String[] args) {
        //create a normal employee
        EmployeeComponent employeeComponent = new EmployeeConreteComponent();
        employeeComponent.doTask();
        System.out.println("------------------");

        //assign employee to team member roles
        System.out.println("TEAM MEMBER:");
        EmployeeComponent teamMember = new TeamMember(employeeComponent);
        teamMember.doTask();
        System.out.println("------------------");

        //assign employee to team leader roles
        System.out.println("TEAM LEADER:");
        EmployeeComponent teamLeader = new TeamLeader(employeeComponent);
        teamLeader.doTask();
        System.out.println("------------------");

        ////assign employee to manager roles
        System.out.println("MANAGER:");
        EmployeeComponent manager = new Manager(employeeComponent);
        manager.doTask();
    }
}
