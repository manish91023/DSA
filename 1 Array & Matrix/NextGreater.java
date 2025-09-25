public class NextGreater {
    public static void main(String[] args) {
       System.out.println(nextGreaterElement(43876));
        
    }
    
    public static int nextGreaterElement(int n) {
       char[] arrN=String.valueOf(n).toCharArray();
       int i=arrN.length-2;
        // to find the smallest element from the right (position)
       while(i>=0 && arrN[i]>=arrN[i+1]){
            i--;
       }
       if(i<0) return -1;

       int j=arrN.length-1;
       while(j>=0 && arrN[i]>=arrN[j]){
        j--;
       }

       swap(arrN,i,j);
         
        reverse(arrN,i+1,arrN.length-1);

         // Step 5: check range
        long result = Long.parseLong(new String(arrN));
        return (result > Integer.MAX_VALUE) ? -1 : (int) result;

    }

    private static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
     private static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}

