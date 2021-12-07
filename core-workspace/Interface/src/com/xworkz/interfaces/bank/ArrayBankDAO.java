package com.xworkz.interfaces.bank;

public class ArrayBankDAO implements BankDAO{

	private BankDAO dao;
	private BankDTO[] bankDTO = new BankDTO[10];
	private int count = 0;
	
	
	
	public ArrayBankDAO(BankDAO dao) {
		super();
		this.dao = dao;
	}

	public ArrayBankDAO(BankDAO dao, BankDTO[] bankDTO, int count) {
		super();
		this.dao = dao;
		this.bankDTO = bankDTO;
		this.count = count;
	}

	public BankDAO getDao() {
		return dao;
	}
	@Override
	public boolean save(BankDTO bankDTO) {
		if (adto != null) {
			System.out.println("Invoked save Air");
			this.airDTO[count++] = adto;
		} else {
			System.out.println("Loo yako null ge point maadthidiya");
		}
		return false;
	}

	@Override
	public BankDTO findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayAllCartDetails() {
		// TODO Auto-generated method stub
		
	}

}
