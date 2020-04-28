package abstract_factory_pattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType type) {
        switch (type){
            case BLACK: return new Black();
            case BLUE: return new Blue();
            case BROWN: return new Brown();
            default: throw new IllegalArgumentException("Color type is unsupported");
        }
    }

    @Override
    public Animal getAnimal(AnimalType animalType) {
        return null;
    }
}
