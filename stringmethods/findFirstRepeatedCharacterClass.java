package com.project.stringmethods;

public class findFirstRepeatedCharacterClass {
	
 public static char findFirstRepeatedCharacter(String inputToFindFirsttRepeatedCharacter) {
		
		int countOfRepeatedLetter = 0;
		char FirstRepeatedCharacter = (char)0;
		int loopVariable=0;
		if(inputToFindFirsttRepeatedCharacter!=null)
		{
		  for(loopVariable=0;loopVariable<inputToFindFirsttRepeatedCharacter.length();loopVariable++) {
		    countOfRepeatedLetter = 0;
		    for(int characterMatchChecker=0;characterMatchChecker<inputToFindFirsttRepeatedCharacter.length();characterMatchChecker++) {
		    if(inputToFindFirsttRepeatedCharacter.charAt(loopVariable) == (inputToFindFirsttRepeatedCharacter.charAt(characterMatchChecker)))
				   countOfRepeatedLetter++;
		    }
		    if(countOfRepeatedLetter > 1)
		    {
		    	FirstRepeatedCharacter = inputToFindFirsttRepeatedCharacter.charAt(loopVariable);
		    	break;
		    }
		  }
		  return FirstRepeatedCharacter;
		}
		else
		 return 0;
	}

}
