package com.project.stringupdated;
import com.project.stringmethods.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class StringProject {
	public static void main(String[] args) throws IOException
	{
		PrintWriter print=new PrintWriter("Strings_Output.txt");
		Scanner stringReader = new Scanner(System.in);
		/*//Reverse the String
		System.out.println("Enter the input to reverse the string to get the reverse string ");
		String inputToReversTheString = stringReader.next();
		//System.out.println(inputToReversTheString);
		print.println("1.Reverse the String ");
		print.println("  Input:" + inputToReversTheString);
		String reverseString = findtheReverseStringClass.findtheReverseString(inputToReversTheString);
		print.println("  Output:" + reverseString);
		print.println("**********************************************************");
		
		//Reverse the Sentence
		stringReader.nextLine();
		System.out.println("Enter the sentence to get the reverse sentence ");
		String inputToReverseTheSentence = stringReader.nextLine();
		print.println("2.Reverse the Sentence ");
		print.println("  Input:" + inputToReverseTheSentence);
		String reverseSentence = findtheReverseSentenceClass.findtheReverseSentence(inputToReverseTheSentence);
		print.println("  Output:" + reverseSentence);
		print.println("**********************************************************");*/
		
		//Respective letters count
	    System.out.println("Enter the string to get the respective letters count ");
		String inputToRespectiveLettersCount = stringReader.next();
		print.println("3.Respective Letters Count in the given sentence/string ");
		print.println("  Input:" + inputToRespectiveLettersCount);
		String RespectiveLettersCount = findtheRespectiveLettersCountClass.findtheRespectiveLettersCount(inputToRespectiveLettersCount);
		print.println("  Output:" + RespectiveLettersCount);
		print.println("**********************************************************");
		
		/*//Remove Repeated Letter
		System.out.println("Enter the string to remove the repeated characters ");
		String inputToRemoveRepeatedLetters = stringReader.next();
		print.println("4.Removal of repeated characters");
		print.println("  Input:" + inputToRemoveRepeatedLetters);
		String removeRepeatedLetters = findRemovalOfRepeatedLettersClass.findRemovalOfRepeatedLetters(inputToRemoveRepeatedLetters);
		print.println("  Output:" + removeRepeatedLetters);
		print.println("**********************************************************"); 
		
		//Highest Repeated Letter
		System.out.println("Enter the string to find the highest repeated character ");
		String inputToFindHighestRepeatedCharacter = stringReader.next();
		print.println("5.Highest Repeated Letter ");
		print.println("  Input:" + inputToFindHighestRepeatedCharacter);
		char highestRepeatedCharacter= findHighestRepeatedCharacterClass.findHighestRepeatedCharacter(inputToFindHighestRepeatedCharacter);
		print.println("  Output:" + highestRepeatedCharacter);
		print.println("**********************************************************");  
		
		//First Repeated Letter
		System.out.println("Enter the string to find the first repeated character ");
		String inputToFindFirsttRepeatedCharacter = stringReader.next();
		print.println("6.First Repeated Letter ");
		print.println("  Input:" + inputToFindFirsttRepeatedCharacter);
		char firstRepeatedCharacter= findFirstRepeatedCharacterClass.findFirstRepeatedCharacter(inputToFindFirsttRepeatedCharacter);
		print.println("  Output:" + firstRepeatedCharacter);
		print.println("**********************************************************");	
		
		//sort the string characters in ascending order
		System.out.println("Enter the string to sort the characters in  ascending order");
		String inputToSortCharactersInAscendingOrder = stringReader.next();
		print.println("7.Sort the string characters in ascending order ");
		print.println("  Input:" + inputToSortCharactersInAscendingOrder);
		String SortCharactersInAscendingOrder = methodToSortCharactersInAscendingOrderClass.methodToSortCharactersInAscendingOrder (inputToSortCharactersInAscendingOrder);
		print.println("  Output:" + SortCharactersInAscendingOrder);*/
		
		
		System.out.println("Check the file Strings_Output.txt for the output");
		
		print.close();
		stringReader.close();
	}
}


