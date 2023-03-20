package FORMEGEOMETRICHE;
import java.util.ArrayList;
import java.util.List;

public class ShapeManager { // lista di oggetti di tipo shape
    private List<Shape> shapes;

    public ShapeManager() {
        this.shapes = new ArrayList<>(); // costruttore con lista vuota
    }

    public void addShape(Shape shape) { // aggiunge forma geometrica alla lista
        shapes.add(shape);
    }

    public List<Shape> getShapes() { // restituisce lista
        return shapes;
    }

    public double getTotaleArea() { // area totale di tutte le forme della lista
        double totaleArea = 0;
        for (Shape shape : shapes) {
            totaleArea += shape.getArea();
        }
        return totaleArea;
    }

    public double getTotalePerimetro() { // perimetro totale di tutte e forme della lista
        double totalePerimetro = 0;
        for (Shape shape : shapes) {
            totalePerimetro += shape.getPerimetro();
        }
        return totalePerimetro;
    }

}