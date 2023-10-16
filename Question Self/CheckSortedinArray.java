public class CheckSortedinArray {
    public static void main(String ar[]){
        int arr[]={12,5,47,55,67};
        boolean sorted = checkSorted(arr,arr.length,1);
        if(sorted){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("No!! Something went Wrong");
        }

    }
    static boolean checkSorted(int arr[],int len,int index){
        if(index>=len){
            return true;
        }
        if(arr[index]>arr[index-1]){
            boolean val=checkSorted(arr, len, index+1);
            return val;
        }else{
            return false;
        }
    }
}
