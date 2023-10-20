import java.util.ArrayList;

public class MergeSort {
    public static void main(String art[]){
        int arr[]={5,6,8,2,4,36};
        sortMerge(arr,0,arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    static void sortMerge(int arr[],int s,int e){
        if(s>=e)
            return;
        int mid=(s+e)/2;
        sortMerge(arr, s, mid);
        sortMerge(arr, mid+1, e);

        merging(arr,s,e);
    }
    static void merging(int arr[],int s,int e){
        int mid=(s+e)/2;
        ArrayList<Integer>leftarr=new ArrayList<Integer>();
        ArrayList<Integer>rightarr=new ArrayList<Integer>();
        int lenLeft = mid - s + 1;
        int lenRight = e - mid;
        int k=s;
        for(int i=0; i<lenLeft; i++) {
            leftarr.add(arr[k]);
            k++;
        }

        k = mid+1;
        for(int i=0; i<lenRight; i++) {
            rightarr.add(arr[k]);
            k++;
        }
        
        int leftIndex = 0;
	    int rightIndex = 0;
	    //yahi pr galti karte h log
	    int mainArrayIndex = s;

        while(leftIndex < lenLeft &&  rightIndex < lenRight) {
            
            if(leftarr.get(leftIndex)< rightarr.get(rightIndex)) {
                arr[mainArrayIndex] =  leftarr.get(leftIndex);
                mainArrayIndex++;
                leftIndex++;
            }
            else {
                arr[mainArrayIndex] =  rightarr.get(rightIndex);
                mainArrayIndex++;
                rightIndex++;
            }
        }


        //2 more cases

        //1 case -> left array exhaust but right array me element abhi bhi bache hai
        while(rightIndex < lenRight) {
            arr[mainArrayIndex] =  rightarr.get(rightIndex);
            mainArrayIndex++;
            rightIndex++;
        }


        //2nd case -> rigght array exhaust but left array me element abhi bhi bache hai
        while(leftIndex < lenLeft) {
            arr[mainArrayIndex] =  leftarr.get(leftIndex);
            mainArrayIndex++;
            leftIndex++;
        }


    }
}
