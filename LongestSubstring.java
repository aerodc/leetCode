import java.util.Arrays;

public class LongestSubstring {

	 public int lengthOfLongestSubstring(String s) {
	        
		 int[] charMap = new int[256];
		 
		 Arrays.fill(charMap, -1);
		 
		 int maxLength=0,j=0;
		 
		 for (int i=0; i < s.length();i++){
			 
			 if(charMap[s.charAt(i)]>=j){
				 
				 j=charMap[s.charAt(i)]+1;
				 
			 }
				 
			 charMap[s.charAt(i)]=i;
			
			 maxLength= Math.max(i-j+1, maxLength);
			 
		 }
		 
		 return maxLength;
	 }
	 
}
