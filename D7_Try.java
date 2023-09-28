public class D7_Try{
    public static void main(String ar[]){
        int i=2;
        int j=0;
        int arr[]=new int[5];
        try{
            j=11/i;
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }catch(ArithmeticException e){
            System.out.println("Zero Divison");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array goes Beyond");
        }catch(Exception e){
            System.out.println("Wrong !!!");
        }
        
        System.out.println("Problem Solve");


    }
}