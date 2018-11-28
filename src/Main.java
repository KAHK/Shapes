import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Circle circle = new Circle(2,3.1415926535797);//parB=pi value
        Triangle triangle = new Triangle(2,3);

        System.out.println(circle.calculateSurface());
        System.out.println(triangle.calculateSurface());
    }
}
