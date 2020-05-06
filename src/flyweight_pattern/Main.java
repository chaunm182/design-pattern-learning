package flyweight_pattern;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] colors = new String[]{"Red","Green","Blue","Black","Purple"};
        for(int i=0;i<20;i++){
            Random random = new Random();
            int randomColor = random.nextInt(5);
            Circle circle = ShapeFactory.getCircle(colors[randomColor]);
            circle.setX(random.nextInt(1000));
            circle.setY(random.nextInt(1000));
            circle.setRadius(100);
            circle.draw();
        }
    }
}
