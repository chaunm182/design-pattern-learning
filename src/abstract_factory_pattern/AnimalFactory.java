package abstract_factory_pattern;

public class AnimalFactory extends AbstractFactory{
    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }

    @Override
    public Animal getAnimal(AnimalType type) {
        switch (type){
            case DUCK: return new Duck();
            case DOG: return new Dog();
            case BEAR: return new Bear();
            default: throw new IllegalArgumentException("Animal type is unsupported");
        }
    }
}
