package builder_pattern;

public interface HouseBuilder {
    HouseBuilder buildBasement(String basement);
    HouseBuilder buildStructure(String stucture);
    HouseBuilder buildRoof(String roof);
    HouseBuilder buildInterior(String interior);
    House build();
}
