class Calc{
    public static void main(String ar[]){
        A obj = new A();
        System.out.println(obj.add(4,6)+" "+obj.sub(6,2)+" "+obj.multi(3,4));

    }
}

class A extends B{
    public int add(int a,int b){
        return a+b;
    }
}
class B extends C{
    public int sub(int a,int b){
        return a-b;
    }
}
class C{
    public int multi(int a,int b){
        return a*b;
    }
}