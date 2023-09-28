public class D5_FunctionalInterface {
        public static void main (String ar[]){
            A obj= new A(){
                public void show(){
                    System.out.println("Functional Interface");
                }
            };
            obj.show();
        }
}
@FunctionalInterface
interface A{
    void show();
}
