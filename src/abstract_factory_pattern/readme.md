## Abstract factory pattern
**Abstract factory pattern** thuộc nhóm **Creational pattern**. Nó hoạt động xung quanh một siêu nhà máy (super-factory) để tạo ra các factory khác. Cũng có thể gọi là factory của các factory. Pattern này cung cấp một cách tốt nhất để tạo ra các object.

Trong Abstract Factory pattern, một interface chịu trách nhiệm tạo ra một Factory của các object có liên quan tới nhau mà không cần phải chỉ ra trực tiếp các class của object. Mỗi Factory được tạo ra có thể tạo ra các object bằng phương pháp giống như Factory pattern

------
#### Ví dụ:
![abstract-factory-pattern-image](https://lh3.googleusercontent.com/QKW5h5LcBt_nNw2Ro63q4wDEK5N25N_ZEIYJl0g4fBtGNAhALAjz7Po7uvzP_tvz0mSdQoKZmlgpQBmdyI6hoOdVcusIqB2bE62cHm6Gb4cp9bmCq7GJaoukbpSOqv50ohL-j-aMuuiubJf42j8EOQk9ZOLwDXH_DEuDfKERtv6b7eKOeBSSxVPBm3xd69FBbvLjnWn5otLUVnTURHpHBOQBngFXN7P72TIZmAWTlwDxJ0unqssPAB-62cxW1dc_5UzzYAZ4pPLaltL9PA4W38sl45ptj2N_v0C7Cejgig3qTW3gDAQMyZyQhPGqcLdSn07U8YUQqJbKjjL_qpsVYmtEbEnj7Ueafuy4RTZ78lYuzePU98ALbcCWwtVQhKtzj6WfraSWXu83nFNRljIQJuJ1coOnJC7T4aIHrNsdUvtiox1rFOrP6r9UxvWhjobEyKDAxr556e9EHCuKxDy6Y9bGCXHW9AWp2eVF5RTo2jtdMRU4v9Bo-nYBNHpJK1iaLiDL8ZW0qeZfVO71Zy3T6ivlPjTn1hCHhPN6Nm5r1Qp3Ml5xCdS97uuETIM339Qxi9IyNx6n8hnCRESNdKMXumXoYxy41eNYf71ruwY9FITVoq4cKCRdWbKMlaEOHIiYvKvnQR-ou0s8LVlPQKNnMrK8SpUqqrUIOvYwf88VbY4t_ej2RQ3X2oF64hsi=w969-h642-no)

**_Bước 1:_** Tạo interface cho Animal
````
public interface Animal {
    String getType();
    String makeSound();
}
````

**_Bước 2:_** Tạo các class implement tới interface animal
````
public class Duck implements Animal {
    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Quạc Quạc";
    }
}
````

````
public class Dog implements Animal {
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Gâu Gâu";
    }
}
````
````
public class Bear implements Animal {
    @Override
    public String getType() {
        return "bear";
    }

    @Override
    public String makeSound() {
        return "buzz";
    }
}
````

**_Bước 3:_** Tương tự tạo interface cho Color và các lớp implement

**_Bước 4:_** Tạo AbstractFactory
````
public abstract class AbstractFactory {
    public abstract Color getColor(ColorType colorType);
    public abstract Animal getAnimal(AnimalType animalType);
}
````

**_Bước 5:_** Tạo các factory con kế thừa AbstractFactory
````
public enum AnimalType {
    DOG,BEAR,DUCK;
}
````
````
public class AnimalFactory extends AbstractFactory{
    @Override
    public Color getColor(ColorType colorType) {
        return null;
    }

    @Override
    public Animal getAnimal(AnimalType type) {
        switch (type){
            case DUCK: return new Duck();
            case DOG: return new Dog();
            case BEAR: return new Bear();
            default: throw new IllegalArgumentException("Animal type is unsupported");
        }
    }
}
````
````
public enum ColorType {
    BLUE,BROWN,BLACK;
}
````
````
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(ColorType type) {
        switch (type){
            case BLACK: return new Black();
            case BLUE: return new Blue();
            case BROWN: return new Brown();
            default: throw new IllegalArgumentException("Color type is unsupported");
        }
    }

    @Override
    public Animal getAnimal(AnimalType animalType) {
        return null;
    }
}
````

**_Bước 6:_** FactoryProvider cho phép để tạo ra các factory con, loại factory con được tạo sẽ phụ thuộc vào tham số truyền vào trong phương thức _getFactory(FactoryType type)_, ví dụ type là ANIMAL, phương thức getFactory sẽ trả về một AnimalFactory
````
public enum FactoryType {
    ANIMAL,COLOR;
}
````
````
public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType type){
        switch (type){
            case COLOR: return new ColorFactory();
            case ANIMAL:return new AnimalFactory();
            default: throw new IllegalArgumentException("Factory type is unsupported");
        }
    }
}
````

**_Bước 7:_** Test
````
public class Main {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProvider.getFactory(FactoryType.COLOR);

        Color blue = colorFactory.getColor(ColorType.BLUE);
        System.out.println(blue.getColor());

        Color brown = colorFactory.getColor(ColorType.BROWN);
        System.out.println(brown.getColor());

        Color black = colorFactory.getColor(ColorType.BLACK);
        System.out.println(black.getColor());

        AbstractFactory animalFactory = FactoryProvider.getFactory(FactoryType.ANIMAL);

        Animal dog = animalFactory.getAnimal(AnimalType.DOG);
        System.out.println(dog.getType()+"/"+dog.makeSound());

        Animal bear = animalFactory.getAnimal(AnimalType.BEAR);
        System.out.println(bear.getType()+"/"+bear.makeSound());

        Animal duck = animalFactory.getAnimal(AnimalType.DUCK);
        System.out.println(duck.getType()+"/"+duck.makeSound());
    }
}
````

====> Kết quả:
````
Blue
brown
black
Dog/Gâu Gâu
bear/buzz
Duck/Quạc Quạc
````