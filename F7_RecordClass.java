public class F7_RecordClass {
    public static void main(String ar[]){
        A obj1 = new A(61,"Suraj");
        System.out.println(obj1);

    }
}

record A(int id,String name){ }
