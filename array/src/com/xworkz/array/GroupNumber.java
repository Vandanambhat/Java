package com.xworkz.array;

public class GroupNumber {

	public static void main(String[] args) {
//		aadharNos
		long gayatri = 910822252464L;// 1
		long sharan = 813996665123L;// 2
		long vandana = 898688564924L;// 3
		long darshan = 984476722672L;// 3
		long mangala = 386175645486L;// 4
		long antony = 566978767536L, kala = 187264573754L, shobha = 82472652342L;// 5 6 7
		long aishwarya = 86459294623L, shreyas = 38637629387L, hema = 923842752754L;// 8 9 10
		long[] aadharNos = { gayatri, sharan, vandana, darshan, mangala, antony, kala, shobha, aishwarya, shreyas,
				hema };

		aadharNos[1] = 725906678268L;
		long index2 = aadharNos[2];
		System.out.println(index2);

		System.out.println("Aadhar numbers");
		for (int no = 0; no < aadharNos.length; no++)// for loop
		{
			System.out.println(no);
			long phone = aadharNos[no];
			System.out.println(phone);
		}

		// banck account
		long bank1 = 295729448568L, bank2 = 14785875931L, bank3 = 95898573892L, bank4 = 9473482764803L,
				bank5 = 38758578462L;
		long bank6 = 305738785302L, bank7 = 69538784762L, bank8 = 38402488376L, bank9 = 2972863366433L,
				bank10 = 93728682686L;

		long[] bankAccountNos = { bank1, bank2, bank3, bank4, bank5, bank6, bank7, bank8, bank9, bank10 };
		System.out.println();
		System.out.println("Bank Account Numbers");
		for (int acc = 0; acc < bankAccountNos.length; acc++) {
			System.out.println(acc);
			long bank = bankAccountNos[acc];
			System.out.println(bank);
		}

		// pin code
		long pin1 = 295729L, pin2 = 147852L, pin3 = 958985L, pin4 = 947348L, pin5 = 387585L;
		long pin6 = 305738L, pin7 = 695387L, pin8 = 384024L, pin9 = 297286L, pin10 = 937286L;

		long[] pincodes = { pin1, pin2, pin3, pin4, pin5, pin6, pin7, pin8, pin9, pin10 };
		System.out.println();
		System.out.println("Pin Codes");
		for (int code = 0; code < pincodes.length; code++) {
			System.out.println(code);
			long pin = pincodes[code];
			System.out.println(pin);
		}

		// order ids
		long order1 = 295729L, order2 = 147852L, order3 = 958985L, order4 = 947348L, order5 = 387585L;
		long order6 = 305738L, order7 = 695387L, order8 = 384024L, order9 = 297286L, order10 = 937286L;

		long[] orderID = { order1, order2, order3, order4, order5, order6, order7, order8, order9, order10 };
		System.out.println();
		System.out.println("Order ID's");
		for (int id = 0; id < orderID.length; id++) {
			System.out.println(id);
			long order = orderID[id];
			System.out.println(order);
		}

		// marks card numbers //roll numbers
		// OTP's //application //ip Address
		// plat formNos // imei // door nos

	}

}
