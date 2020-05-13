package strategy_pattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("add: "+context.execute(10,5));

        context = new Context(new OperationMul());
        System.out.println("mul: "+context.execute(10,5));

        context = new Context(new OperationSub());
        System.out.println("sub: "+context.execute(10,5));
    }
}
