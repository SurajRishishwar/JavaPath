import java.util.ArrayList;
import java.util.List;

class EvenNumberUsingRecursion{
    public static void main(String args[]){
        int arr[]= {4,2,6,8,9,9,9,9};
        List<Integer> brr=new ArrayList<Integer>();

        evenPicker(arr,arr.length,0,brr);

        for(int n:brr){
            System.out.println(n);
        }

    }

    static void evenPicker(int arr[],int size,int index,List<Integer> brr){
        if(index>=size){
            return;
        }
        if(arr[index]%2==0){
            brr.add(arr[index]);
        }
        evenPicker(arr, size, index+1, brr);
    }
}