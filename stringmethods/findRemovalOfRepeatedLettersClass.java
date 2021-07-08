package com.project.stringmethods;

public class findRemovalOfRepeatedLettersClass {
	
	public static String findRemovalOfRepeatedLetters(String inputToRemoveRepeatedLetters) {
		
		int countOfRepeatedLetter=0;
		String finalStringAfterRemovalofRepeatedLetters = " ";
		int loopVariable=0;
		if(inputToRemoveRepeatedLetters!=null)
		{
		  for(loopVariable=0;loopVariable<inputToRemoveRepeatedLetters.length();loopVariable++) {
		    countOfRepeatedLetter = 0;
		    for(int characterMatchChecker=0;characterMatchChecker<inputToRemoveRepeatedLetters.length();characterMatchChecker++) {
		    if(inputToRemoveRepeatedLetters.charAt(loopVariable) == (inputToRemoveRepeatedLetters.charAt(characterMatchChecker)))
				   countOfRepeatedLetter++;
		    }
		    if(countOfRepeatedLetter>1)
	        	   continue;
		    else
		    {
		    if(finalStringAfterRemovalofRepeatedLetters.equals(" "))
			 {
		    	finalStringAfterRemovalofRepeatedLetters = Character.toString(inputToRemoveRepeatedLetters.charAt(loopVariable));
			 }
			 else
			 {
				 finalStringAfterRemovalofRepeatedLetters = finalStringAfterRemovalofRepeatedLetters.concat(Character.toString(inputToRemoveRepeatedLetters.charAt(loopVariable)));
			 }
		    }
		  }
		  System.out.println(finalStringAfterRemovalofRepeatedLetters);
		  return finalStringAfterRemovalofRepeatedLetters;
		}
		else
			return null;
	}

}
