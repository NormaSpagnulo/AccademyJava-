public class Circle extends Shape {
    // Definizione della classe Circle che estende Shape
    private double raggio;

    public Circle(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double getArea() {
        return Math.PI * raggio * raggio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raggio;
    }
}
