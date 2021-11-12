package xworkz.com.Palindrome;

import java.util.*;

/*
 *Palindrome program using "Scanner"  
 */
public class Palindrome {

	public static void main(String[] args) {

		String original;
		String reverse = "";
		
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string to check palindrome");
		original=in.nextLine();
		
		 int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      
	      if (original.equalsIgnoreCase(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	}

} 

/*
 * Palindrome Program in Java using recursion (with strings)
 */
//class Palindrome {
//
//	public static boolean Palindrome(String a) {
//
//		if (a.length() == 0 || a.length() == 1) {
//			return true;
//		}
//		if (a.charAt(0) == a.charAt(a.length() - 1)) {
//			return Palindrome(a.substring(1, a.length() - 1));
//		}
//		return false;
//	}
//
//	public static void main(String[] args) {
//
//		Scanner inp = new Scanner(System.in);
//		System.out.print("Enter the string: ");
//		String string = inp.nextLine();
//		if (Palindrome(string)) {
//			System.out.println(string + " is a palindrome");
//		} else {
//			System.out.println(string + " is not a palindrome");
//		}
//	}
//}

/*
 * Palindrome Program in Java using Library methods (strings)
 */
//import java.util.*;
//class Palindrome{
//  public static void Palindrome(String s){
//    String reverse = new StringBuffer(s).reverse().toString();
//    if (s.equals(reverse)){
//      System.out.println("Yes, it is a palindrome");
//    }
//    else{
//      System.out.println("No, it is not a palindrome");
//    }
//}
//  
//public static void main (String[] args){
//  Palindrome("erre");
//}
//}


/*
 * Palindrome Number Program in Java
 */
//import java.util.Scanner;
//class expalindrome 
//{
//public static void main(String args[]) 
//{
//int x,number, y=0,temp=0;
//Scanner s=new Scanner(System.in);
//System.out.println("Enter any number: ");
//number=s.nextInt();
//x=number;
//while(number>0)
//{
//x=number%10;
//number=number/10;
//temp=temp*10+x;
//}
//if(temp==y)
//{
//System.out.println("Number is Palindrome");
//}
//else
//{
//System.out.println("not Palindrome");
//}
//}
//}