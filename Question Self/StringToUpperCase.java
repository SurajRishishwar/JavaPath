import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String ar[]){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // String news= s.toUpperCase();
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A'&&arr[i]<='Z'){
                System.out.print(arr[i]);
            }else if(arr[i]==' '){
                System.out.print(' ');
            }
            else{
                System.out.print((char)(arr[i]-32));
            }
        }



        input.close();
    }
}
