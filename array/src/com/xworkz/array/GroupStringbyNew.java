package com.xworkz.array;

public class GroupStringbyNew {
//passport no,gst, specs model no
//Home address,face book ids
	public static void main(String[] args) {
//		vehicle number
		String vandana = "KA 14 LM 5928";
		String varun = "KA 27 GN 4587";
		String suma = "KA 31 SG 7893";

		String[] vehicleNos = new String[4];
		vehicleNos[0] = vandana;
		vehicleNos[2] = varun;
		vehicleNos[1] = suma;
		for (int no = 0; no < vehicleNos.length; no++) {
			System.out.println(no);
			String temp = vehicleNos[no];
			if (temp != null) {
				temp = temp.toLowerCase();
				System.out.println(temp);
			} else {
				System.out.println(temp);
			}
		}
//		pan card
		String megha = "BHG4079V";// 1
		String soujanya = "VIP3384M";// 2
		String monisha = "KHG2974C";// 3
		String yamini = "RYT9463D";// 4
		String renu = "UIO8363S";// 5
		String venkatesh = "KHF5758T";// 6
		String rama = "SBC8577R";// 7
		String uma = "LAJ7839Y";// 8
		String mouna = "RBK9476U";// 9
		String harshi = "SHK9357B";

		String[] panNos = new String[10];// used "NEW" keyword
		panNos[0] = megha;
		panNos[1] = soujanya;
		panNos[2] = monisha;
		panNos[3] = yamini;
		panNos[4] = renu;
		panNos[5] = venkatesh;
		panNos[6] = rama;
		panNos[7] = uma;
		panNos[8] = mouna;
		panNos[9] = harshi;

		System.out.println();
		System.out.println("PAN card numbers");
		for (int num = 0; num < panNos.length; num++) {
			System.out.println(num);
			String tem = panNos[num];// null
			if (tem != null) {
				tem = tem.toUpperCase();// null pointer
				System.out.println(tem);
			} else {
				System.out.println(tem);
			}
		} // end of for loop

//		IFSC code
		String ifsc1 = "CNRB0005396";// 1
		String ifsc2 = "CNRB0004587";// 2
		String ifsc3 = "SBI00034533";// 3
		String ifsc4 = "SBI03982486";// 4
		String ifsc5 = "VIJB0024789";// 5
		String ifsc6 = "KARB0095532";// 6
		String ifsc7 = "KARB0006335";// 7
		String ifsc8 = "CNRB0003453";// 8
		String ifsc9 = "SBIB9976443";// 9
		String ifsc10 = "CNRB9827422";// 10

		String[] ifscCode = new String[10];// used "NEW" keyword
		ifscCode[0] = ifsc1;
		ifscCode[1] = ifsc2;
		ifscCode[2] = ifsc3;
		ifscCode[3] = ifsc4;
		ifscCode[4] = ifsc5;
		ifscCode[5] = ifsc6;
		ifscCode[6] = ifsc7;
		ifscCode[7] = ifsc8;
		ifscCode[8] = ifsc9;
		ifscCode[9] = ifsc10;

		System.out.println();
		System.out.println("IFSC Codes");
		for (int num = 0; num < ifscCode.length; num++) {
			System.out.println(num);
			String tem = ifscCode[num];// null
			if (tem != null) {
				tem = tem.toUpperCase();// null pointer
				System.out.println(tem);
			} else {
				System.out.println(tem);
			}
		} // end of for loop

//		password
		String pass1 = "kajh8247ahg";// 1
		String pass2 = "kje312sbwj3";// 2
		String pass3 = "sjeh8728sj3";// 3
		String pass4 = "ksr3wr4b342";// 4
		String pass5 = "wj5435hwwnb";// 5
		String pass6 = "jeh823whr34";// 6
		String pass7 = "jerhuy83478";// 7
		String pass8 = "sjjr348ciw2";// 8
		String pass9 = "sjhr348bc42";// 9
		String pass10 = "sjehri3428";// 10

		String[] passwords = new String[10];// used "NEW" keyword
		passwords[0] = pass1;
		passwords[1] = pass2;
		passwords[2] = pass3;
		passwords[3] = pass4;
		passwords[4] = pass5;
		passwords[5] = pass6;
		passwords[6] = pass7;
		passwords[7] = pass8;
		passwords[8] = pass9;
		passwords[9] = pass10;

		System.out.println();
		System.out.println("Passwords");
		for (int num = 0; num < passwords.length; num++) {
			System.out.println(num);
			String tem = passwords[num];// null
			if (tem != null) {
				tem = tem.toLowerCase();// null pointer
				System.out.println(tem);
			} else {
				System.out.println(tem);
			}
		} // end of for loop

//		 app version
		String ver1 = "kajh8247ahg";// 1
		String ver2 = "kje312sbwj3";// 2
		String ver3 = "sjeh8728sj3";// 3
		String ver4 = "ksr3wr4b342";// 4
		String ver5 = "wj5435hwwnb";// 5
		String ver6 = "jeh823whr34";// 6
		String ver7 = "jerhuy83478";// 7
		String ver8 = "sjjr348ciw2";// 8
		String ver9 = "sjhr348bc42";// 9
		String ver10 = "sjehri3428";// 10

		String[] version = new String[10];// used "NEW" keyword
		passwords[0] = pass1;
		passwords[1] = pass2;
		passwords[2] = pass3;
		passwords[3] = pass4;
		passwords[4] = pass5;
		passwords[5] = pass6;
		passwords[6] = pass7;
		passwords[7] = pass8;
		passwords[8] = pass9;
		passwords[9] = pass10;

		System.out.println();
		System.out.println("Passwords");
		for (int num = 0; num < passwords.length; num++) {
			System.out.println(num);
			String tem = passwords[num];// null
			if (tem != null) {
				tem = tem.toLowerCase();// null pointer
				System.out.println(tem);
			} else {
				System.out.println(tem);
			}
		} // end of for loop

	}// end of main
}// end of class
