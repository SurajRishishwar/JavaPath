import java.util.ArrayList;

public class MergeTwoSortedArray {
    public static void main(String art[]){
        int arr[]={23,45};
        int brr[]={9,99};
        ArrayList<Integer> output=new ArrayList<Integer>();
        int i=0,j=0;

        while(i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                output.add(arr[i]);
                i++;
            }else{
                output.add(brr[j]);
                j++;
            }
        }
        while(i<arr.length){
            output.add(arr[i]);
            i++;
        }
        while(j<brr.length){
            output.add(brr[j]);
            j++;
        }

        System.out.println(output);


    }
}
