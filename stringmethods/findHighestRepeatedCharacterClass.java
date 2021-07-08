package com.project.stringmethods;

public class findHighestRepeatedCharacterClass {
	
public static char findHighestRepeatedCharacter(String inputToFindHighestRepeatedCharacter) {
		
		int countOfRepeatedLetter=0;
		char HighestRepeatedCharacter = (char)0;
		int loopVariable=0;
		int countOfPreviousRepeatedLetter = 1;
		if(inputToFindHighestRepeatedCharacter!=null)
		{
		  for(loopVariable=0;loopVariable<inputToFindHighestRepeatedCharacter.length();loopVariable++) {
		    countOfRepeatedLetter = 0;
		    for(int characterMatchChecker=0;characterMatchChecker<inputToFindHighestRepeatedCharacter.length();characterMatchChecker++) {
		    if(inputToFindHighestRepeatedCharacter.charAt(loopVariable) == (inputToFindHighestRepeatedCharacter.charAt(characterMatchChecker)))
				   countOfRepeatedLetter++;
		    }
		    if(countOfRepeatedLetter > countOfPreviousRepeatedLetter)
		    {
		    	countOfPreviousRepeatedLetter = countOfRepeatedLetter;
		    	HighestRepeatedCharacter = inputToFindHighestRepeatedCharacter.charAt(loopVariable);
		    }
		  }
		  return HighestRepeatedCharacter;
		}
		else
		 return 0;
	}


}
