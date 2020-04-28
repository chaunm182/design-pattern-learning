package abstract_factory_pattern;

public abstract class AbstractFactory {
    public abstract Color getColor(ColorType colorType);
    public abstract Animal getAnimal(AnimalType animalType);
}
