package com.xworkz.wrapperClass;

public class integerwrap {

	public static void main(String[] args) {
		
		//Integer	
		//1
		int rank=100;
		Integer rank1=new Integer(7);
		int r=Integer.valueOf(rank).compareTo(rank1);//compareTo
		System.out.println("Integer Methods");
		System.out.println(r);
		
		//2 getInteger
		Integer high=Integer.highestOneBit(rank);//highestOneBit
		System.out.println(high);
		//3
		System.out.println(Integer.lowestOneBit(rank));//lowestOneBit
		//4
		System.out.println(Integer.rotateLeft(rank, 1));//rotateLeft
		//5
		System.out.println(Integer.bitCount(rank));//bitCount
		System.out.println();
		
		//float methods
		float percentage=90f;
		System.out.println("Float methods");
		System.out.println(Float.intBitsToFloat(6));//intBitsToFloat
		Float percent=new Float(90f);
		Float percent1=new Float(85f);
		//1
		System.out.println(Float.compare(percent, percentage));//compare
		System.out.println(new Float(30.4f).compareTo(new Float(30.4f)));//compare
		//2
		System.out.println(percent1.compareTo(percent));//compareTo
		//3
		System.out.println(percent.floatValue()==percent1.floatValue());//equals
		//4
		System.out.println(Float.MIN_VALUE);//min value
		System.out.println(Float.SIZE);//size
		
		System.out.println();
		//double methods
		//1
		System.out.println("Double methods");
		double rational=223.5576d;
		System.out.println(Double.doubleToLongBits(rational));//doubleToLongBits
		//2
		System.out.println(Double.isInfinite(rational));//isInfinite
		//3
		System.out.println(Double.isFinite(rational));//isFinite
	}

}
