public class C1_DynamicDispatch {
    public static void main(String ar[]){
        A obj = new B();
        obj.show();

        obj= new A();
        obj.show();

    }
    
}
class A{
    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }
}

