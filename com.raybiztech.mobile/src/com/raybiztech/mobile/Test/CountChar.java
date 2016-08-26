package com.raybiztech.mobile.Test;

import java.util.HashMap;

public class CountChar {

	
	    static void characterCount(String s)
	    {
	        //Creating a HashMap containing char as a key and occurrences as  a value
	 
	        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	 
	        //Converting given string to char array
	 
	        char[] strArray = s.toCharArray();
	 
	        //checking each char of strArray
	 
	        for (char c : strArray)
	        {
	            if(count.containsKey(c))
	            {
	                //If char is present in charCountMap, incrementing it's count by 1
	 
	                count.put(c, count.get(c)+1);
	            }
	            else
	            {
	                //If char is not present in charCountMap,
	                //putting this char to charCountMap with 1 as it's value
	 
	                count.put(c, 1);
	            }
	        }
	 
	        //Printing the charCountMap
	 
	        System.out.println(count);
	    }
	    
	
	    public static void main(String[] args)
	    {
//	       
	       characterCount("saandeep is");
	       
	  String r= "R"+"C";
	  System.out.println(r);
	    }
	}