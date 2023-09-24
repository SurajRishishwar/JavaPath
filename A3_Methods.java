class Methods{
    public static void main(String ar[]){
        Container cont = new Container();
        int a = cont.add(34,6);
        String s = cont.sayhello("Suraj");
        System.out.println(s);
        System.out.println(a);
    }
}
class Container{
    public int add(int a,int b){
        return a+b;
    }
    public String sayhello(String a){
        return "Hello "+a;
    }
}