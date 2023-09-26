public class C2_Final {
    public static void main(String ar[]){
        /*final*/ int n = 45;// using final before type of variable makes it constant no one can chnage it.
        n=9;
        System.out.println(n);
        B obj= new B();
        obj.show();
        obj.display();
    }
}

/*final*/class A{// if we want that no one can inherit the super class then we make it final.
    public /*final*/ void show(){ // if we want that no one can override the method of super class then we made them fnal.
        System.out.println("in A");
    }
    public void display(){
        System.out.println("in both Display");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B");
    }

}