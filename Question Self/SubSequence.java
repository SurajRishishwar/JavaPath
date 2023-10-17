import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String ar[]){
        // Scanner input = new Scanner(System.in);
        String s = "abc";
        String out="";
        printSubSequence(s,out,0);
        // input.close();
    }
    public static void printSubSequence(String s,String out,int i){
        if(i>=s.length()){
            System.out.println(out);
            return;
        }
        char ch = s.charAt(i);
        out=out+ch;
        printSubSequence(s, out, i+1);
        out=out.substring(0, out.length()-1);
        printSubSequence(s, out, i+1);

        
      

    }
}
