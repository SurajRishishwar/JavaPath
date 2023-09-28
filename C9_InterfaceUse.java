public class C9_InterfaceUse {
    public static void main(String ar[]){
        Computer obj =new Laptop();
        Computer obj1=new Desktop();
        Developer suraj = new Developer();
        suraj.devapp(obj);
    }
        
    
}

class Developer{
    public void devapp(Computer obj){
        obj.code();
    }
}

interface Computer{
    public abstract void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("This is Laptop Code");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("This is desktop code");
    }
}