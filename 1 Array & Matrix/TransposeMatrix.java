class TransposeMatrix{
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Transpoe(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Transpoe(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}