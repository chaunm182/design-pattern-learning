package facade_pattern;

public class Samsung implements MobileShop {
    @Override
    public String getModelNo() {
        return "Samsung Galaxy S10";
    }

    @Override
    public double getPrice() {
        return 100000;
    }
}
