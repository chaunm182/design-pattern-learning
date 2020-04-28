package builder_pattern;

public class MyHouseBuilder implements HouseBuilder {
    private House house;
    public MyHouseBuilder() {
        this.house = new House();
    }
    @Override
    public HouseBuilder buildBasement(String basement) {
        house.setBasement(basement);
        return this;
    }
    @Override
    public HouseBuilder buildStructure(String stucture) {
        house.setStructure(stucture);
        return this;
    }
    @Override
    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof);
        return this;
    }

    @Override
    public HouseBuilder buildInterior(String interior) {
        house.setInterior(interior);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
