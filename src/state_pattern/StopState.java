package state_pattern;

public class StopState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Stop state");
    }
}
