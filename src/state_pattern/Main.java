package state_pattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StartState());
        context.applyState();

        context.setState(new StopState());
        context.applyState();
    }
}
