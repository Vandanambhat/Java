package com.xworkz.random;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int left=0,right=s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)!=s.charAt(right)) {
				count++;
			}
			left++;
			right--;
		}
		if(count == 0) {
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}

}
