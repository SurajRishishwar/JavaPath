import java.util.Scanner;

public class E2_ScannerInput{
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n= sc.nextInt();
    
        System.out.println(n);

        sc.close();
    }
}