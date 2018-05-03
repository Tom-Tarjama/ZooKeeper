package com.codingdojo.zookeeperone;

public class Mammal {
	private Integer energyLevel = 100;

	
	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel += energyLevel;
	}


	public Integer displayEnergy(){
		System.out.println("Energy level: "+this.energyLevel);
		return this.energyLevel;
	};

}
