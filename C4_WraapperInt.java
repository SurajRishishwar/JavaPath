public class C4_WraapperInt {
    public static void main(String a[]){
        int num1=3;
        Integer num1obj = new Integer(num1); // boxing;
        Integer num1obj1 = num1;            // auto-boxing
        System.out.println(num1obj1);

        int num2=num1obj1.intValue();       //unboxing
        int num3=num1obj1;                  //auto-unboxing
        System.out.println(num3);

    }
}
