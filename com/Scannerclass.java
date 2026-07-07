
package com;
import java.util.*;
import static java.lang.System.*;
public class Scannerclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String text="Hello 98";
		Scanner sc=new Scanner(text);
		out.println("Text value   "+sc.next());
		out.print("Number value  "+sc.nextInt());

	}

}
