
public class StrStr {

	 public int strStr(String haystack, String needle) {
		 
		 	
		 if(haystack.isEmpty()&&!needle.isEmpty()) return -1;
	        
	        if(needle.isEmpty()) return 0;
	        
	        if(needle.length()>haystack.length()) return -1;
	        
	        int i, j;
	        
	        for(i=0;i<haystack.length();i++){
	        	
	        	for(j=0; j<needle.length(); j++){
	        		
	        		if(i+j>=haystack.length())
	        			return -1;
	        		
	        		if(haystack.charAt(i+j)!=needle.charAt(j))
	        			break;
	        	}
	        	
	        	if(j==needle.length())
	        		return i;
	        }
	        
	        return -1;
	        
	        
	 }
}
