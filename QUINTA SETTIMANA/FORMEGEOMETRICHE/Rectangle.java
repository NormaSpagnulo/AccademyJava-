package FORMEGEOMETRICHE;
// Definizione della classe Rectangle che estende Shape
public class Rectangle extends Shape {
    private double lunghezza;
    private double altezza;

    public Rectangle(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    @Override
    public double getArea() {
        return lunghezza * altezza;
    }

    @Override
    public double getPerimetro() {
        return 2 * (lunghezza + altezza);
    }
}

