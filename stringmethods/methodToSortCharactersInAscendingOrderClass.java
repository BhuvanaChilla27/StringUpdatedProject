package com.project.stringmethods;

import java.util.Arrays;

public class methodToSortCharactersInAscendingOrderClass {
	
public static String methodToSortCharactersInAscendingOrder (String inputToSortCharactersInAscendingOrder) {
		
		if(inputToSortCharactersInAscendingOrder!=null)
		{
		
		String toconverttolowercase = inputToSortCharactersInAscendingOrder.toLowerCase();
		char arrayToConvertStringtoArray[] = toconverttolowercase.toCharArray();
	    Arrays.sort(arrayToConvertStringtoArray);
	    String finalOutputToSortCharactersInAscendingOrder = new String(arrayToConvertStringtoArray);
	    String firstletterOfString = finalOutputToSortCharactersInAscendingOrder.substring(0,1);
	    String remLettersOfString = finalOutputToSortCharactersInAscendingOrder.substring(1);
	    firstletterOfString = firstletterOfString.toUpperCase();
	    finalOutputToSortCharactersInAscendingOrder = firstletterOfString.concat(remLettersOfString);
	    return finalOutputToSortCharactersInAscendingOrder;
		}
		else
		return null;
	}
}
