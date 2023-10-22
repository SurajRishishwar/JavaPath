public class QuickSort {
    public static void main(String art[]){
        int arr[]={2,4,6,2,1,3};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int i=s-1;
        int j=s;
        int pivot=e;
        while(j<pivot){
            if(arr[j]<arr[pivot]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        i++;
        int tep=arr[i];
        arr[i]=arr[pivot];
        arr[pivot]=tep;
        quickSort(arr, s, i-1);
        quickSort(arr, i+1, e);
    }

}
