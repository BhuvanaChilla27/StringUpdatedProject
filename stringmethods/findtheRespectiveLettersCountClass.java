package com.project.stringmethods;

public class findtheRespectiveLettersCountClass {

	public static String findtheRespectiveLettersCount(String inputToRespectiveLettersCount) {
		
		int countOfRepeatedLetter=0;
		String finalOutputToRespectiveLettersCount = " ";
		int loopVariable=0;
		char temp = inputToRespectiveLettersCount.charAt(0);
		if(inputToRespectiveLettersCount!=null)
		{
		  for(loopVariable=0;loopVariable<inputToRespectiveLettersCount.length();loopVariable++) {
			 
			 if(inputToRespectiveLettersCount.charAt(loopVariable)==temp)
			 {
				 countOfRepeatedLetter++;
			 }
			 else
			 {
				 if(finalOutputToRespectiveLettersCount.equals(" "))
				 {
					   finalOutputToRespectiveLettersCount = Character.toString(inputToRespectiveLettersCount.charAt(loopVariable-countOfRepeatedLetter));
					   finalOutputToRespectiveLettersCount = finalOutputToRespectiveLettersCount.concat(String.valueOf(countOfRepeatedLetter));
				 }
				 else
				 {
					   finalOutputToRespectiveLettersCount = finalOutputToRespectiveLettersCount.concat(Character.toString(inputToRespectiveLettersCount.charAt(loopVariable-countOfRepeatedLetter)));
					   finalOutputToRespectiveLettersCount = finalOutputToRespectiveLettersCount.concat(String.valueOf(countOfRepeatedLetter));
					   
				 }
				 countOfRepeatedLetter = 1;
				 temp = inputToRespectiveLettersCount.charAt(loopVariable);
				 
			 }

		  }
		  return finalOutputToRespectiveLettersCount;
		}
		else
			return null;
	}
}


