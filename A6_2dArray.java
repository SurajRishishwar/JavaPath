class Multiarray{
    public static void main(String ar[]){
        //2D Array
        int arr[][]=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }


        // Jagged Array
        int arr2[][]=new int[3][];// columns are optional
        arr2[0]=new int[2];
        arr2[1]=new int[4];
        arr2[2]=new int[1];

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i[]:arr2){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}