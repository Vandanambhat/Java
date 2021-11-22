package com.xworkz.crud.chocolate.brand;

public class AddBrandName {

	private int price;
	private String[] brandName = new String[5];
	private int count=0;
	
	public AddBrandName() {
		this(230);
		System.out.println("Invoked no arg contructor");
	}

	public AddBrandName(int price) {
		this.price = price;
		System.out.println("Invoked parameterized constructor");
	}

	public int getPrice() {
		return price;
	}
	
	public void displayChocolate()
	{
		for(int choco=0;choco<brandName.length;choco++)
		{
			String cho=this.brandName[choco];
			System.out.println(cho);
		}
	}
	
	public void addBrandNames(String names)
	{
		//System.out.println("Brand name is :".concat(names));
		if(count<=4)
		{
		brandName[count]=names;
		count++;
		}
	}

}// end of class