package abstract_factory_pattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProvider.getFactory(FactoryType.COLOR);

        Color blue = colorFactory.getColor(ColorType.BLUE);
        System.out.println(blue.getColor());

        Color brown = colorFactory.getColor(ColorType.BROWN);
        System.out.println(brown.getColor());

        Color black = colorFactory.getColor(ColorType.BLACK);
        System.out.println(black.getColor());

        AbstractFactory animalFactory = FactoryProvider.getFactory(FactoryType.ANIMAL);

        Animal dog = animalFactory.getAnimal(AnimalType.DOG);
        System.out.println(dog.getType()+"/"+dog.makeSound());

        Animal bear = animalFactory.getAnimal(AnimalType.BEAR);
        System.out.println(bear.getType()+"/"+bear.makeSound());

        Animal duck = animalFactory.getAnimal(AnimalType.DUCK);
        System.out.println(duck.getType()+"/"+duck.makeSound());
    }
}
