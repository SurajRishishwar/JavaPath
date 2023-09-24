class Array{
    public static void main(String args[]){
        //base method 
        int arr[]={1,3,4,5};

        // preferred method
        int arr2[]=new int[5];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=(int)(Math.random()*10);
        }

        for(int i:arr2){
            System.out.println(i);
        }
    }
}