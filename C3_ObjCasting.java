public class C3_ObjCasting {
    public static void main(String ar[]){
        A obj = new B();
        B obj1 =(B) obj;
        obj1.showfor();

    }
}

class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void showfor(){
        System.out.println("in B show");
    }
}
