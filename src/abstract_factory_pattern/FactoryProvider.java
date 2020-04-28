package abstract_factory_pattern;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType type){
        switch (type){
            case COLOR: return new ColorFactory();
            case ANIMAL:return new AnimalFactory();
            default: return null;
        }
    }
}
