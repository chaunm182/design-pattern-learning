package bridge_pattern;

public class Main {
    public static void main(String[] args) {
        Workshop produce = new Produce();
        Workshop assemble = new Assemble();

        Vehicle bus = new Bus(produce,assemble );
        bus.manufacture();

        Vehicle bike = new Bike(produce,assemble);
        bike.manufacture();
    }
}
