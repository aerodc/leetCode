
public class TwoSum {
	
	 public int[] twoSum(int[] nums, int target) {
	        
		 int[] result = new int[2];
		 
		 if(nums.length==2){
			 
			 result[0]=0;
			 result[1]=1;
			 
			 return result;
			 
		 }else{
			 
			 boolean flag =false;
			 
			 for(int i=0; i<nums.length;i++){
				 
				 result[0]=i+1;
				 for(int j=i+1; j<nums.length;j++){
					 if((nums[i]+nums[j])==target){
						 result[1]=j+1;
						 flag=true;
						 break;
					 }
						 
				 }
				 
				 if(flag)
					 break;
				 
				 
			 }
			 
			 return result;
		 }
		 
	 }
}
