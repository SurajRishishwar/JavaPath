public class BinarySearch {
    public static void main(String ar[]){
        int arr[]={3,4,6,7,8,9};
        int key=36;
        int len = arr.length;
        int isPresent=findKey(arr,key,0,len-1);
        if(isPresent!=-1){
            System.out.println("Element is found at "+isPresent);
        }else{
            System.out.println("Oops No not at all");
        }
    }
    public static int findKey(int arr[],int key,int s,int e){
        if(s>e){
            return -1;
        }
        
        int mid= s+(e-s)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            return findKey(arr,key,s,mid-1);
        }else{
            return findKey(arr,key,mid+1,e);
        }
    
    }
}
