public class C7_AnonymousInnerClass {
    public static void main(String ar[]){
        A obj = new A(){               // here some changes
            public void show(){
                System.out.println("Its me new one");
            }
        };
        obj.show();
    }
}

class A{
    public void show(){
        System.out.println("Its me A");// if we want to override this function without creating child class[anonymous class]
    }
}