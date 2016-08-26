package com.raybiztech.mobile.Test;

public class Practice {

	public static int limit=0;

	public static  void fibanaco(int limit) {

		Practice.limit=limit;

		long[] series = new long[limit];

		series[0] = 0;
		series[1] = 1;
		for (int i = 2; i < limit; i++) {
			series[i] = series[i - 1] + series[i - 2];
		}

		for (int i = 0; i < limit; i++) {
			System.out.println(series[i]);
		}
	}

	public static void reverse() {
		String s = "saandeep";

		char[] c = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--)

			System.out.print(c[i]);

		StringBuilder sb = new StringBuilder(s);

		StringBuilder temp = sb.reverse();

		System.out.println(temp);

		String s1 = temp.toString();

		if (s1.equalsIgnoreCase("wow")) {
			System.out.println("paledrome");
		}

		else

			System.out.println("not a palindrome");
	}

	public static void armstrong() {

		int c = 0, a, temp;

		int n = 153;
		temp = n;
		while (n > 0)

		{
			a = n % 10;
			n = n / 10;

			c = c + (a * a * a);

		}

		if (temp == c)

		{
			System.err.println("arm");
		}

		else
			System.out.println("no");
	}

	public static void main(String[] args) {

	 Practice.fibanaco(10);
		//
		// Practice.reverse();

		Practice.armstrong();

		// TODO Auto-generated method stub

	}

}
