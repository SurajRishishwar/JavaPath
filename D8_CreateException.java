public class D8_CreateException {
    public static void main(String ar[]){
        int i=0;
        try{
            if(i==0){
                throw new ValueZero("i : 0");
            }
        }catch(ValueZero v){
            System.out.println("Hey the value of i might be wrong ");
            System.out.println(v);
        }
        System.out.println("Problem Solved");
    }

    
}

class ValueZero extends Exception{
    public ValueZero(String str){
        super(str);
    }
}
