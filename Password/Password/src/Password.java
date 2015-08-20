public class Password {
		
	static private boolean checkLength(String theWord) {
		return theWord.length() >= 10;
	}
	
	static private boolean checkForOnlyDigitsAndLetters(String theWord) {
		String OnlyDigitsAndLettersPattern = "^[a-zA-Z0-9]*$";
        if(theWord.matches(OnlyDigitsAndLettersPattern)){
            return true;
        }
        return false; 
	}
	
	static private boolean checkThatContainsAtLeastThreeDigits(String theWord) {
		String AtLeastThreeDigitsPattern = "\\d{3,}";
		if(theWord.matches(AtLeastThreeDigitsPattern)){
            return true;
        }
        return false; 
	}
	
	static boolean checkPassword(String theWord) {
		return (checkLength(theWord) &&
				checkForOnlyDigitsAndLetters(theWord) && 
				checkThatContainsAtLeastThreeDigits(theWord)
				);
	}
}