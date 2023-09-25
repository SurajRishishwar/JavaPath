class superrr{
    public static void main(String ar[]){
        B b = new B(5);

    }
}
class A{
    A(){
        System.out.println("In a Default");
    }
    A(int x){
        System.out.println("In a parameterized "+x);
    }
}

class B extends A{
    B(){
        super(4);
        System.out.println("In b Default");
    }
    B(int x){
        this();
        System.out.println("In b parameterized "+x);
    }
}