### Decorator pattern

**Decorator pattern** là một trong những Pattern thuộc nhóm cấu trúc (Structural Pattern). Nó cho phép người dùng thêm chức năng mới vào đối tượng hiện tại mà không muốn ảnh hưởng đến các đối tượng khác. Kiểu thiết kế này có cấu trúc hoạt động như một lớp bao bọc (wrap) cho lớp hiện có. Mỗi khi cần thêm tính năng mới, đối tượng hiện có được wrap trong một đối tượng mới (decorator class).

#### Sử dụng decorator pattern:
- Khi muốn thêm tính năng mới cho các đối tượng mà không ảnh hưởng đến các đối tượng này.

- Khi không thể mở rộng một đối tượng bằng cách thừa kế (inheritance). Chẳng hạn, một class sử dụng từ khóa final, muốn mở rộng class này chỉ còn cách duy nhất là sử dụng decorator.

- Trong một số nhiều trường hợp mà việc sử dụng kế thừa sẽ mất nhiều công sức trong việc viết code. Ví dụ trên là một trong những trường hợp như vậy.
----

#### Ví dụ

![decorator-pattern-uml-demo](https://github.com/minhchauptit/design-pattern-learning/blob/master/src/decorator_pattern/decorator-pattern-uml-demo.png?raw=true)

**_Bước 1:_** Tạo interface cho EmployeeComponent
````
public interface EmployeeComponent {
    void doTask();
}
````
**_Bước 2:_** Tạo lớp concrete
````
public class EmployeeConreteComponent implements EmployeeComponent {
    @Override
    public void doTask() {
        System.out.println("Employee do task");
    }
}
````
**_Bước 3:_** Tạo lớp decorator, đây là lớp trừu tượng
````
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
````

**_Bước 4:_** tạo các lớp concrete kế thừa lớp decorator
````
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
````
````
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
````
````
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
````

**_Bước 5:_** Test
````

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
````

Kết quả:
````
Employee do task
------------------
TEAM MEMBER:
Employee do task
Team member perform task
Team member coordinate with others
------------------
TEAM LEADER:
Employee do task
Team member planning
------------------
MANAGER:
Employee do task
Manager assign task
Manager manage progress
````
