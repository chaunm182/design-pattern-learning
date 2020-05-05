package bridge_pattern;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("assembled");
    }
}
