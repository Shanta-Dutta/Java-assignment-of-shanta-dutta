package myLearning;
import java.util.Scanner;
import java.util.*;

public class AsciiChar {
	 public static void main(String[] args) {
		 printNumbers();
		  printLowerCase();
		  printUpperCase();
  
  		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		  
	  }
	public static void printNumbers()
	
	  {
	    // TODO: print valid numeric input
	  
		for(int i =48; i <=57 ; i++) {
			String myNum = Character.toString ((char) i);
			System.out.println(myNum);
		}
	  }
	
		public static void printLowerCase()
		  {
		    // TODO: print valid lowercase alphabetic input
			for(int i =97; i <=122 ; i++) {
				String myLocase = Character.toString ((char) i);
				System.out.println( myLocase);
			}
		  }

		  public static void printUpperCase()
		  {
		    // TODO: print valid uppercase alphabetic input
			  for(int i =65; i <=90 ; i++) {
					String myUpcase = Character.toString ((char) i);
					System.out.println( myUpcase);
		  
		}
			  
		  }
	
} 





