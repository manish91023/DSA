import java.util.Stack;

public class MaxRect {
    public static void main(String[] args) {
        int[][] matrix={
            {0,1,1,0},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,0,0}
        };
        System.out.println(maximalRectangle(matrix));
    }

    private static int maximalRectangle(int[][] matrix){
        if(matrix.length==0) return 0;

        int cols=matrix[0].length;

        int[] histogram=new int[cols];
        int maxArea=0;

        for(int i=0;i<matrix.length;i++){
            //for histogram 
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==1){
                    histogram[j]+=1;
                }else{
                    histogram[j]=0;
                }
            }
            // find max area for this histogram
            int areas=largestRectangleArea(histogram);
            maxArea=Math.max(maxArea, areas);
        }
        return maxArea;

    }

    private static int  largestRectangleArea(int[] histogram){
        Stack<Integer> stack=new Stack<>();

        int maxArea=0;
        int n=histogram.length;

        for(int i=0;i<=n;i++){
            int h=(i==n)?0:histogram[i];

            while (!stack.isEmpty() && h < histogram[stack.peek()]) {
                int height=histogram[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                maxArea=Math.max(maxArea,height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }


}
