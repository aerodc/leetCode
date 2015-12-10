
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
        
		if(s.isEmpty())
			return true;
		
		boolean result=true;
		
		int i=0, j=s.length()-1;
		
		while(true){
			if(isAlphanumeric(s.charAt(i))){
				if(isAlphanumeric(s.charAt(j))){
					if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
						i++;
						j--;
					}else{
						result=false;
						break;
					}
						
				}else{
					j--;
				}
			}else{
				i++;
			}
			if(i>j)
				break;
		}
		
		
		return result;
    }
	
	
	public boolean isAlphanumeric(char c){
		
		return Character.isLetter(c)||Character.isDigit(c) ;
	}

}
