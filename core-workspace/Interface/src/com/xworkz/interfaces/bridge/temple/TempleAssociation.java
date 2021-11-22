package com.xworkz.interfaces.bridge.temple;

public class TempleAssociation {

	private DevoteeRule devoteeRule;
	private String templeName;

	public TempleAssociation() {
		System.out.println("Invoked TempleAssociation");
	}

	public TempleAssociation(DevoteeRule devoteeRule, String templeName) {
		System.out.println("Invoked TempleAssociation(DevoteeRule devoteeRule,String templeName)");
		this.devoteeRule = devoteeRule;
		this.templeName = templeName;
	}

	public void allowDevoteeRule() {

		if (devoteeRule != null) {
			boolean slippersOff = this.devoteeRule.slippersOff();

			if (slippersOff) {
				boolean photo = this.devoteeRule.dontTakePhoto();
				boolean silence = this.devoteeRule.maintainSilence();

				if (photo && silence) {
					System.out.println("good devotee, god will bless you");
				} else {
					System.out.println("devotee ninge thale elva, sumniru");
				}
			} else {
				System.out.println("Pekra, chapli bittu baa");
			}

		} else {
			System.out.println("Value you are giving is null");
		}
	}
}
