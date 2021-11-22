package com.xworkz.dp.starter;

import com.xworkz.dp.dao.MilkCanDAO;
import com.xworkz.dp.dto.MilkCanDTO;

public class MilkCanStarter {

	public static void main(String[] args) {
			
				MilkCanDAO dao = new MilkCanDAO();
				dao.create(new MilkCanDTO(1000f, "Square", "very good", "Black", 400f));
				dao.create(new MilkCanDTO(1500f, "Cylinder", "good", "White", 500f));

				dao.create(new MilkCanDTO(1500f, "Cylinder", "good", "White", 500f),4);
				dao.indexOccupied();
				dao.matchByColor("Black");

				MilkCanDTO[] docRef = dao.getMilk();

				for (int flower = 0; flower < docRef.length; flower++) {

					MilkCanDTO ref = docRef[flower];
					if (ref != null) {
						System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
						System.out.println(ref.getColorOfCan());
						System.out.println(ref.getQualityOfCan());
						System.out.println(ref.getShapeOfCan());
						System.out.println(ref.getPriceOfCan());
						System.out.println(ref.getQuantity());
			
						System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
					} else {
						System.out.println("Either the array is full or pointing to null".concat(String.valueOf(flower)));
					}
				}
			}

}// end
