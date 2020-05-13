package state_pattern;

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void applyState(){
        state.handleRequest();
    }
}
