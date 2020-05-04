## Facade pattern
**Facade Pattern** là một trong những Pattern thuộc nhóm cấu trúc (Structural Pattern). Pattern này cung cấp một giao diện chung đơn giản thay cho một nhóm các giao diện có trong một hệ thống con (subsystem). Facade Pattern định nghĩa một giao diện ở một cấp độ cao hơn để giúp cho người dùng có thể dễ dàng sử dụng hệ thống con này.

**Facade Pattern** cho phép các đối tượng truy cập trực tiếp giao diện chung này để giao tiếp với các giao diện có trong hệ thống con. Mục tiêu là che giấu các hoạt động phức tạp bên trong hệ thống con, làm cho hệ thống con dễ sử dụng hơn.

#### Sử dụng facade pattern:
- Khi hệ thống có rất nhiều lớp làm người sử dụng rất khó để có thể hiểu được quy trình xử lý của chương trình. Và khi có rất nhiều hệ thống con mà mỗi hệ thống con đó lại có những giao diện riêng lẻ của nó nên rất khó cho việc sử dụng phối hợp. Khi đó có thể sử dụng Facade Pattern để tạo ra một giao diện đơn giản cho người sử dụng một hệ thống phức tạp.

- Khi người sử dụng phụ thuộc nhiều vào các lớp cài đặt. Việc áp dụng Façade Pattern sẽ tách biệt hệ thống con của người dùng và các hệ thống con khác, do đó tăng khả năng độc lập và khả chuyển của hệ thống con, dễ chuyển đổi nâng cấp trong tương lai.

- Khi bạn muốn phân lớp các hệ thống con. Dùng Façade Pattern để định nghĩa cổng giao tiếp chung cho mỗi hệ thống con, do đó giúp giảm sự phụ thuộc của các hệ thống con vì các hệ thống này chỉ giao tiếp với nhau thông qua các cổng giao diện chung đó.

- Khi bạn muốn bao bọc, che giấu tính phức tạp trong các hệ thống con đối với phía Client.
----

#### Ví dụ

**_Bước 1:_** Tạo interface cho MobileShop
````
public interface MobileShop {
    String getModelNo();
    String getPrice();
}
````

**_Bước 2:_** Tạo các class implement tới interface MobileShop
````
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
````

**_Bước 3:_** Tạo lớp facade
````
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
````

**_Bước 4:_** Test
````
public class Main {
    public static void main(String[] args) {
        MobileShopFacade facade = new MobileShopFacade();
        facade.iphoneSale();
        System.out.println("-------------");
        facade.samsungSale();
    }
}
````

Kết quả:
````
Model: Iphone 11
Price: 1000000.0
-------------
Model: Samsung Galaxy S10
Price: 100000.0
````