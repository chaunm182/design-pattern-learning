package state_pattern;

public class StartState implements State{

    @Override
    public void handleRequest() {
        System.out.println("Start state");
    }
}
