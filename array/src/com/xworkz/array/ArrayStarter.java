package com.xworkz.array;

public class ArrayStarter {

	public static void main(String[] args) {
		
		long anmol=9108222564L;
		long shivu=8139966651L;
		long pooja=9880568275L;
		long ambika=9844722672L;
		long vandana=9686885440L;
		
		//two ways to create array
		// 1.
		//2.using new keyword
		
		long[] phoneNos= {shivu,anmol,pooja,ambika,vandana,9901191388L};
		
		//ref passed, length is fixed
		//[s][a][p][am][v]
		phoneNos[1]=7259068268L;
		long index3=phoneNos[3];
		System.out.println(index3);
		
		for(int no=0;no<phoneNos.length;no++)//for loop
		{
			System.out.println(no);
			long phone=phoneNos[no];
			System.out.println(phone);
		}

	}

}
