import java.util.Scanner;

public class StringToArray {
    public static void main(String ar[]){
        Scanner input=new Scanner(System.in);
        String s = input.nextLine();
    
        char arr[]= s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                char ch='$';
                arr[i]=ch;
            }
        }
        System.out.println(arr);

        



        input.close();
    }
    
}
