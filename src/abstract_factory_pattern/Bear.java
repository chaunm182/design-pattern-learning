package abstract_factory_pattern;

public class Bear implements Animal {
    @Override
    public String getType() {
        return "bear";
    }

    @Override
    public String makeSound() {
        return "buzz";
    }
}
