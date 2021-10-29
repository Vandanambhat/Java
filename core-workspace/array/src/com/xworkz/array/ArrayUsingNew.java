package com.xworkz.array;

public class ArrayUsingNew {

	public static void main(String[] args) {
		String vandana="KA 14 LM 5928";
		String varun="KA 27 GN 4587";
		String suma="KA 31 SG 7893";
		
		String[] vehicleNos=new String[4];//used "NEW" keyword 
		vehicleNos[0]=vandana;
		vehicleNos[2]=varun;
		vehicleNos[1]=suma;
		for(int no=0;no<vehicleNos.length;no++)
		{
			System.out.println(no);
			String temp=vehicleNos[no];//null
			if(temp!=null)
			{
				temp=temp.toLowerCase();//null pointer
				System.out.println(temp);
			}
			else
			{
				System.out.println(temp);
			}
		}
	}

}
