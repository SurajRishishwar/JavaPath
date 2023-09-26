class MethodOverriding{
    public static void main(String ar[]){

    
    Adcalc obj = new Adcalc();
    int r = obj.add(3,5);
    System.out.println(r);
    }
}
class calc{
    public int add(int a,int b){
        return a+b;
    }
}
class Adcalc extends calc{
    public int add(int a,int b){
        return a+b+1;
    }
}
