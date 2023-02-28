package METODI;
public class Main {
    public static void main(String[] args) {
        // Casting implicito da int a double
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("Valore int: " + intValue);
        System.out.println("Valore double dopo il casting implicito: " + doubleValue);

        // Casting esplicito da double a int
        doubleValue = 10.5;
        intValue = (int) doubleValue;
        System.out.println("Valore double: " + doubleValue);
        System.out.println("Valore int dopo il casting esplicito: " + intValue);
    }
}
