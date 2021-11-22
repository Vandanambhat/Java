package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MilkCanDTO;

public class MilkCanDAO {
	
		private MilkCanDTO[] milk = new MilkCanDTO[15];
		private int count = 0;

		public MilkCanDTO[] getMilk() {
			return milk;
		}

		public void create(MilkCanDTO dto) {
			if (milk != null) {
				this.milk[count++] = dto;
				System.out.println("Invoked create method with dto ");
			}
		}

		public void create(MilkCanDTO color, int index) {
			if (color != null && index < milk.length && index >= 0) {
				this.milk[index] = color;
				System.out.println("Invoked overloading create method with age and index");
			} else {
				System.out.println("Either the array is full or pointing to null");
			}
		}

		public int indexOccupied() {
			System.out.println("Index occupied is : ".concat(String.valueOf(count)));
			return this.count;
		}

		public boolean matchByColor(String color) {

			for (int pin = 0; pin < milk.length; pin++) {
				MilkCanDTO ref = this.milk[pin];

				if (milk != null) {
					System.out.println("array index is not null ".concat(String.valueOf(pin)));

					String color1 = ref.getColorOfCan();
					System.out.println("price is : ".concat(color1));

					if (color1.equals(color1)) {
						System.out.println("price is same");
						return true;
					}
				}
			}
			System.out.println("price is not same");
			return false;
		}
	}// end of MilCanDAO
