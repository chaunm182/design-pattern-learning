package facade_pattern;

public class Iphone implements MobileShop {
    @Override
    public String getModelNo() {
        return "Iphone 11";
    }

    @Override
    public double getPrice() {
        return 1000000;
    }
}
