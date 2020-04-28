package builder_pattern;

public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new MyHouseBuilder();
        House myHouse = builder.buildBasement("Wooden Poles")
                        .buildStructure("Wood and Ice")
                        .buildRoof("Wood")
                        .buildInterior("Fire Wood")
                        .build();

        System.out.println(myHouse);
    }
}
