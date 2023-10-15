import java.util.Scanner;

public class StringCompare {
    public static void main(String ar[]){
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        System.out.println(str1.equals(str2));
        input.close();
    }
}
