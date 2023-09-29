public class E3_TryWithFinally {
    public static void main(String ar[]){
        int i=0;
        int j=0;
        try{    
            j=18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divided by zero  : "+e);
        }
        finally{
            System.out.println("Bye");
        }
    }
}
