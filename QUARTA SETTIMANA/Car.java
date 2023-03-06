public class Car extends Vehicle{

    private String modelName = "Fiat";
    public static void main(String[] args){
    Car myCar = new Car();
    myCar.honk();
    myCar.run();
    System.out.println(myCar.brand+" "+ myCar.modelName);
    }
    
}
