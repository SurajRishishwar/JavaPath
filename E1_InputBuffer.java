import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E1_InputBuffer {
    public static void main(String ar[]) throws IOException{
        System.out.println("Enter a Number : ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        int n = Integer.parseInt(bf.readLine());
        System.out.println("You Entered : "+n);
        bf.close();
    }
}