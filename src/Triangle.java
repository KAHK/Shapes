public class Triangle extends Shape {
    public Triangle(double parA, double parB) {
        super(parA, parB);
    }
    public double calculateSurface()
    {
        return 0.5 * parA * parB;
    }
}
