class Overloading{
    public static void main(String ar[]){
        Container cont = new Container(); 
        int r = cont.add(34,7,9);
        System.out.println(r);
    }
}
class Container{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}