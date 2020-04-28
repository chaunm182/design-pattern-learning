package abstract_factory_pattern;

public class Duck implements Animal {
    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Quạc Quạc";
    }
}
