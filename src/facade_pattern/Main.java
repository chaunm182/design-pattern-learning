package facade_pattern;

public class Main {
    public static void main(String[] args) {
        MobileShopFacade facade = new MobileShopFacade();
        facade.iphoneSale();
        System.out.println("-------------");
        facade.samsungSale();
    }
}
