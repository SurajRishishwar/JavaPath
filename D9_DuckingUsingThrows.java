public class D9_DuckingUsingThrows {
    public static void main(String ar[]){
        A obj =  new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found in the Telusko Directory : " + e);
        }

    }
}
class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Status");
    }
}
