package com.raybiztech.mobile.Test;

import java.io.IOException;
import java.util.HashMap;

public class Demo {
	static int n1 = 0, n2 = 1, n3 = 0;
	
	static void charCount(String s)
	{
		HashMap<Character, Integer> count=new HashMap<Character, Integer>();
		
		
		char[] stringchar=s.toCharArray();
		
		for(char c: stringchar)
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else 
			{
				count.put(c, 1);
			}
			
			System.out.println(count);
			
		}
		
		
	
	}

	public static void main(String args[]) throws IOException {

//		String s = "saandeep";
//
//		StringBuffer reader = new StringBuffer(s);
//
//		StringBuffer temp = reader.reverse();
//
//		System.out.println(temp);
//
//		char c[] = s.toCharArray();
//
//		for (int i = c.length - 1; i >= 0; i--)
//			System.out.print(c[i]);

		  //number of elements to generate in a series
        int limit = 3;
       
        long[] series = new long[limit];
       
        //create first 2 series elements
        series[0] = 0;
        series[1] = 1;
       
        //create the Fibonacci series and store it in an array
        for(int i=2; i < limit; i++){
                series[i] = series[i-1] + series[i-2];
        }
       
        //print the Fibonacci series numbers
       
        System.out.println("Fibonacci Series upto " + limit);
        for(int i=0; i< limit; i++){
                System.out.print(series[i] + " ");
	}
	}
}
//	 public static void notepad() throws IOException
//	
//	 {
//	 FilePermission permission = new
//	 FilePermission("C:\\Users\\User\\Desktop","read");
//	 FileReader reader= new FileReader("C:\\Users\\User\\Desktop");
//	
//	
//	 BufferedReader br=new BufferedReader(reader);
//	
//	
//	 String line;
//	
//	 while((line=br.readLine())!=null)
//	
//	 {
//	 System.out.println(line);
//	 }
//	 }
//
//		
//	}



// }