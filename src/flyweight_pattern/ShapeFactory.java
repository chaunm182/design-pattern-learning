package flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String,Shape> circleMap = new HashMap<>();

    public static Circle getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);
        if (circle==null){
           circle = new Circle();
           circle.setColor(color);
           circleMap.put(color,circle);
        }
        return circle;
    }
}
