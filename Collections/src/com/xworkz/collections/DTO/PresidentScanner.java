package com.xworkz.collections.DTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

public class PresidentScanner {

	public static void main(String[] args) {

		PresidentDTO dto1 = new PresidentDTO(1, "modi", 10, "India");
		PresidentDTO dto2 = new PresidentDTO(2, "rahul", 3, "italy");
		PresidentDTO dto3 = new PresidentDTO(3, "kejriwal", 4, "delhi");
		PresidentDTO dto4 = new PresidentDTO(4, "trum", 6, "russsia");
		PresidentDTO dto5 = new PresidentDTO(5, "baidan", 8, "us");

		List<PresidentDTO> presidentDTOs = new ArrayList<PresidentDTO>();
		presidentDTOs.add(dto5);
		presidentDTOs.add(dto4);
		presidentDTOs.add(dto3);
		presidentDTOs.add(dto2);
		presidentDTOs.add(dto1);

		// list, set or Stream
		Comparator<PresidentDTO> comparator = (e1, e2) -> {// Anonymous class
			int e1Tenure = e1.getId();
			int e2Tenure = e2.getId();
			if (e1Tenure == e2Tenure)
				return 0;
			if (e1Tenure < e2Tenure)
				return 1;
			if (e1Tenure > e2Tenure)
				return -1;
			return 0;
		};

		presidentDTOs.stream().filter((dto) -> dto.getCountryName().equals("India")).sorted(comparator)
		.forEach((dto) -> System.out.println(dto));// This will print only the president of India

		System.out.println(System.lineSeparator());

		Collections.sort(presidentDTOs, comparator);
		presidentDTOs.forEach((dto) -> System.out.println(dto));// This will print all the presidentDTO properties

		System.out.println(System.lineSeparator());

		presidentDTOs.stream().sorted(comparator)
		.forEach((dto) ->System.out.println(dto.getName().concat(" ")
		.concat(String.valueOf(dto.getTenure()))));
	}

}
