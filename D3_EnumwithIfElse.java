public class D3_EnumwithIfElse {
    public static void main(String ar[]){
        Status s=Status.Closed;
        if(s == Status.Verified){
            System.out.println("Login Successfully Done");
        }else{
            System.out.println("Window Crashed");
        }   


        switch(s){
            case Verified->System.out.println("Login Successfully Done");
            default->System.out.println("Window Crashed");
        }
    }
    
}

enum Status{
    Verified,Closed
}