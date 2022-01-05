package com.xworkz.collections.Map.DTO_DAO;

import java.util.HashMap;
import java.util.Map;

public class PersonScammer {

	public static void main(String[] args) {

		Map<PersonDTO, AddressDTO> personAddress = new HashMap<PersonDTO, AddressDTO>();
		
		// person details
		PersonDTO personDTO1=new PersonDTO(1, "Akshi", 21, "Akshi@gmail.com");
		PersonDTO personDTO2=new PersonDTO(2, "manasa", 22, "manasa@gmail.com");
		PersonDTO personDTO3=new PersonDTO(3, "karan", 25, "karan@gmail.com");
		PersonDTO personDTO4=new PersonDTO(4, "sharan", 23, "sharan@gmail.com");
		PersonDTO personDTO5=new PersonDTO(5, "kiran", 26, "kiran@gmail.com");
		PersonDTO personDTO6=new PersonDTO(6, "priya", 28, "priya@gmail.com");
		PersonDTO personDTO7=new PersonDTO(7, "suma", 19, "suma@gmail.com");
		PersonDTO personDTO8=new PersonDTO(8, "rama",17, "rama@gmail.com");
		PersonDTO personDTO9=new PersonDTO(9, "uma", 21, "uma@gmail.com");
		PersonDTO personDTO10 = new PersonDTO(10, "Mangala", 22, "mangala@gmail.com");
		
		// address details
		AddressDTO addressDTO1=new AddressDTO(1, 18, "Jayanagar", "Shimoga", 577201);
		AddressDTO addressDTO2=new AddressDTO(2, 20, "basavanagudi", "Shimoga", 577223);
		AddressDTO addressDTO3=new AddressDTO(3, 30, "koramangala", "Bengaluru", 560302);
		AddressDTO addressDTO4=new AddressDTO(4, 45, "BTM", "Bengaluru", 560361);
		AddressDTO addressDTO5=new AddressDTO(5, 134, "Girinagar", "Bengaluru", 560566);
		AddressDTO addressDTO6=new AddressDTO(6, 467, "Rajajinagar", "Bengaluru", 560441);
		AddressDTO addressDTO7=new AddressDTO(7, 45, "BTM", "Bengaluru", 560361);
		AddressDTO addressDTO8=new AddressDTO(8, 45, "Ujire", "mangaluru", 574240);
		AddressDTO addressDTO9=new AddressDTO(9, 45, "Devinagar", "bellary", 562121);
		AddressDTO addressDTO10=new AddressDTO(10, 45, "Balki", "Bidar", 585401);
	}

}
