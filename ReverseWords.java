
public class ReverseWords {

	
	public String reverseWords(String s) {
        
      if(s.isEmpty()) return "";
		
		s=s.trim();
		
		String[] arr = s.split(" ");
		
		String result="";
		
		for(int i=arr.length-1; i>=0;i--){
			
			if(!arr[i].trim().isEmpty())
				result=result+" "+arr[i];
		}
		
		return result.trim();
    
        
    }
}
