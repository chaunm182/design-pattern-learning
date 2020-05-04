package facade_pattern;

public class MobileShopFacade {
    private MobileShop iphone;
    private MobileShop samsung;

    public MobileShopFacade() {
        iphone = new Iphone();
        samsung = new Samsung();
    }

    public void iphoneSale(){
        System.out.println("Model: "+iphone.getModelNo());
        System.out.println("Price: "+iphone.getPrice());
    }

    public void samsungSale(){
        System.out.println("Model: "+samsung.getModelNo());
        System.out.println("Price: "+samsung.getPrice());
    }
}
