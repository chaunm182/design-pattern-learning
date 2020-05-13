package interpreter_pattern;

public class SubExpression implements Expression {
    private String expression;

    public SubExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.subtract(expression);
    }
}
