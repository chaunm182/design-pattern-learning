package template_pattern;

public abstract class PageTemplate {
    protected void showHeader(){
        System.out.println("Header");
    }

    protected void showNav(){
        System.out.println("Navigation");
    }

    protected void showFooter(){
        System.out.println("Footer");
    }

    public abstract void showBody();

    public final void showPage(){
        showHeader();
        showNav();
        showBody();
        showFooter();
    }
}
