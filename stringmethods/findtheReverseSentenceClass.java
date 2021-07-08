package com.project.stringmethods;

public class findtheReverseSentenceClass {
	
public static String findtheReverseSentence(String inputToReverseTheSentence)  {
		
	    if(inputToReverseTheSentence!=null)
	    {
	    	String[] splitTheWordsInTheGivenSentence = inputToReverseTheSentence.split(" ");
	    	String newInputToReverseTheSentence = " ";
	    	int spaceCounttemp = 0;
	    	for(String reverseIndividualWord : splitTheWordsInTheGivenSentence)
	    	{
	    		++spaceCounttemp;
	    		StringBuffer inputToReverseTheIndividualWord = new StringBuffer(reverseIndividualWord);
	    		if(newInputToReverseTheSentence.equals(" "))
	            newInputToReverseTheSentence = inputToReverseTheIndividualWord.reverse().toString();
	    		else
	    		newInputToReverseTheSentence = newInputToReverseTheSentence.concat(inputToReverseTheIndividualWord.reverse().toString());
	    		if(spaceCounttemp == splitTheWordsInTheGivenSentence.length)
	    			break;
	    		else
	    			newInputToReverseTheSentence = newInputToReverseTheSentence.concat(" ");
	    		
	    	}
	    	StringBuffer finalOutputToReverseTheSentence = new StringBuffer(newInputToReverseTheSentence);
	    	finalOutputToReverseTheSentence.reverse();
	    	return finalOutputToReverseTheSentence.toString();
	    }
	    else
	      return null;
	}

}
