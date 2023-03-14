public class OuterClass {
    /*String a = "ciao";

    private class InnerClass{
        String b = "come stai?";
    }

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass(); //creo oggetto prima classe
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.a + " " + myInner.b);
    }*/
    
    int x = 10;
    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
    
}
 
