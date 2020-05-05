package composite_pattern;

public class Developer implements Employee {
    private Integer id;
    private String name;
    private String position;

    public Developer() {
    }

    public Developer(Integer id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(id+"/"+name+"/"+position);
    }
}
