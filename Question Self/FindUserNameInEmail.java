import java.util.Scanner;

public class FindUserNameInEmail {
    public static void main(String ar[]){

        Scanner input=new Scanner(System.in);
        String email=input.next();
        char em[]= email.toCharArray();
        char userName[]= new char[30];
        for(int i=0;em[i]!='@';i++){
            userName[i]=em[i];
        }

    
        System.out.println(userName);

        input.close();
        
    }
}
