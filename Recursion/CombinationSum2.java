import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        List< List <Integer> > ans=new ArrayList<>();
        int target=7;
        int candidates[] = {2,3,6,7};
        findCombinations(0,candidates,target,ans, new ArrayList<>());
        System.out.println("Final Combinations: " + ans);
        // System.out.println(ans);
    }
    private static void findCombinations(int idx,int candidates[],int target, List<List<Integer>> ans,List<Integer>ds ){
        System.out.println("Checking index: " + idx + " with target: " + target + " current list: " + ds);
        if(candidates.length==idx){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[idx]<=target){
            ds.add(candidates[idx]);
            findCombinations(idx+1, candidates, target-candidates[idx], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(idx+1, candidates, target, ans, ds);
        // System.out.println(ans);
    }
}
