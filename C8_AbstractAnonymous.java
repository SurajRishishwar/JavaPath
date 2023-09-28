public class C8_AbstractAnonymous {
    public static void main(String ar[]){
        A boj = new A(){
            public void show(){
                System.out.println("Its an object of Abstract class");
            }
        };

        boj.show();

    }
}
abstract class A
{
    public abstract void show();
}