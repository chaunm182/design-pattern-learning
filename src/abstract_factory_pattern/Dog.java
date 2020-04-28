package abstract_factory_pattern;

public class Dog implements Animal {
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Gâu Gâu";
    }
}
