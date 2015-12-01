import java.util.HashMap;

public class TwoSumSolution2 {

	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> hm= new HashMap<>();
        
		for(int i=0; i<nums.length ;i++){
			
			if(hm.containsKey(target-nums[i])){
				return new int[]{hm.get(target-nums[i])+1,i+1};
			}
			
			hm.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("exception: no solution found!");
    }
	
}
