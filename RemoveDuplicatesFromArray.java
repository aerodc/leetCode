
public class RemoveDuplicatesFromArray {
	
	 public int removeDuplicates(int[] nums) {
	        
	    if(nums.length<=1) return nums.length;
	    
	    int beginIndex=0;
	    
	    for(int i=1;i<nums.length;i++){
	    	if(nums[i]!=nums[beginIndex]){
	    		beginIndex++;
	    		nums[beginIndex]=nums[i];
	    	}
	    }
	    
	    return beginIndex+1;
	 }
}
