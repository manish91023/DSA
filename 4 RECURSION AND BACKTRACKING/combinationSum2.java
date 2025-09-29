import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class combinationSum2 {
    public static void main(String[] args) {
        int candidates[]={1,2,10,7,6,1,5};
        Arrays.sort(candidates);
        List<List<Integer>>result=new ArrayList<>();
        backtrack(candidates, 8, 0, new ArrayList<>(), result);
        System.out.println(result);
    }
    private static void backtrack(int[] candidates,int remain,int start,List<Integer>temp,List<List<Integer>>result){
        if(remain==0){
            result.add(new ArrayList<>(temp));
            return ;
        }


        for(int i=start;i<candidates.length;i++){
         if(i>start && candidates[i]==candidates[i-1]) continue;

         if(candidates[i]>remain) break;

            temp.add(candidates[i]);
            backtrack(candidates,remain-candidates[i],i+1,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}