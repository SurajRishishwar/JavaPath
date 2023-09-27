public class C6_InnerClass {
    public static void main(String a[]){
        A obj = new A();
        obj.show1();

        A.B obj1 = obj.new B();// new A.B(); if make B class Static
        obj1.show2();
        


    }
}

class A{
    public void show1(){
        System.out.println("In A");
    }

    /*static*/ class B{
        public void show2(){
            System.out.println("In B");
        }
    }
}
