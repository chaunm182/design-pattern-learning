package template_pattern;

public class Main {
    public static void main(String[] args) {
        PageTemplate home = new HomePage();
        home.showPage();
        System.out.println("-----------");
        PageTemplate productPage = new ProductPage();
        productPage.showPage();
    }
}
