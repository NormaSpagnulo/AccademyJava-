public class Parent {
    void show()
    {
       System.out.println("Parent's show()");
    }

}

class Child extends Parent{//BINOMIO sia override che 
    @Override  //sovrascrive il metodo e tiene gli elementi del padre
    void show(){
        super.show();
        System.out.println("Child's show()");
    }
}

class MainM{
    public static void main(String[] args){
        Parent obj = new Child();
        obj.show();
    }
}
