public class Pippo {
    int x;
    boolean boolValue;
  
    public Pippo(int x) {
      this.x = x;
      if (x > 50) {
        boolValue = true;
      } else {
        boolValue = false;
      }
    }
      public static void Unlocker(boolean value) {
        boolean isUnlocked;
        isUnlocked = !value;
      }
      public static void Locker(boolean value) {
        if(value=true){
          Unlocker(value);
        }value = value;
      }
  
    public static void main(String[] args) {
      Pippo obj1 = new Pippo(10);
      Pippo obj2 = new Pippo(80);
  
      System.out.println("Obj1 - x: " + obj1.x + ", Valore booleano: " + obj1.boolValue);
      System.out.println("Obj2 - x: " + obj2.x + ", Valore booleano: " + obj2.boolValue);
    }
}
