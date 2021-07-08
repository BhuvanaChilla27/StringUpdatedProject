package com.project.stringmethods;

public class findtheReverseStringClass {
	
public static String findtheReverseString (String inputToReversTheString) {
		
	    if(inputToReversTheString!=null)
	    {
            StringBuffer  inputToReversTheStringInMethod= new StringBuffer(inputToReversTheString);
            inputToReversTheStringInMethod.reverse();
            //System.out.println(inputToReversTheStringInMethod);
		    return inputToReversTheStringInMethod.toString();
	    }
	    else
	      return null;
	}

}
