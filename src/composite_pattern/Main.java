package composite_pattern;

public class Main {
    public static void main(String[] args) {
        EmployeeComposite composite = new EmployeeComposite();
        composite.addEmp(new Developer(100,"Nguyen Van A","Developer"));
        composite.addEmp(new Developer(101,"Nguyen Van B","Pro developer"));

        composite.showDetails();
    }
}
