package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WalletDTO;
import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {

	private WalletDTO[] walletDTOs=new WalletDTO[10];
	private int count = 0; 
	
	public void create(WalletDTO dto) {
		if (walletDTOs != null) {
			this.walletDTOs[count++] = dto;
			System.out.println("Invoked create method with dto ");
		}
	}

	public void create(WalletDTO companyName, int index) {
		if (companyName != null && index < walletDTOs.length && index >= 0) {
			this.walletDTOs[index] = companyName;
			System.out.println("Invoked parameterized create method with age and index");
		} else {
			System.out.println("Either the array is full or pointing to null");
		}
	}

	public int indexOccupied() {
		System.out.println("Index occupied is : ".concat(String.valueOf(count)));
		return this.count;
	}

	public boolean matchByWallet(String specilization) {

		for (int nikon = 0; nikon < walletDTOs.length; nikon++) {
			WalletDTO ref = this.walletDTOs[nikon];

			if (walletDTOs != null) {
				System.out.println("array index is not null ".concat(String.valueOf(nikon)));

				String spl = ref.getCompanyName();
				System.out.println("Specialization is : ".concat(spl));

				if (spl.equals(specilization)) {
					System.out.println("specialization is same");
					return true;
				}
			}
		}
		System.out.println("specialization is not same");
		return false;
	}
}
