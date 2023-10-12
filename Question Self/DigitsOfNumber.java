import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String ar[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Digits(n);

        input.close();
    }
    public static void Digits(int n){
        if(n==0){
            return;
        }
        int d = n%10;
        Digits(n/10);
        System.out.println(d);
    }
}
