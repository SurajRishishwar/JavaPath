public class E4_Thread {
    public static void main(String ar[]){
        A obj1  = new A();
        B obj2  = new B();
        obj1.start();
        obj2.start();

    }
}
class A extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("A");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("B");
        }
    }
}
