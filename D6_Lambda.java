public class D6_Lambda{
    public static void main(String ar[]){
        A obj = (c) -> {// LAmbda Expression
                System.out.println("In Show : "+c);
            };

        obj.show(5);

    }
}

@FunctionalInterface
interface A{
    void show(int x);
}