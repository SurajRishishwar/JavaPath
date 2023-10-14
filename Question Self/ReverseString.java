import java.util.Scanner;
public class ReverseString {
    public static void main(String ar[]){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        char arr[]=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(arr);




        input.close();
    }
}
