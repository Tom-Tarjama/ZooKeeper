package com.codingdojo.zookeeperone;

public class Dragon extends Mammal {
	public Dragon(){
		this.setEnergyLevel(200);
	}
	
	public void fly() {
		System.out.println("Whoosh");
		this.setEnergyLevel(-50);
	}
	
	public void eatHumans() {
		System.out.println("Chomp chomp");
		this.setEnergyLevel(25);
	}
	
	public void attackTown() {
		System.out.println("The town is burning!");
		this.setEnergyLevel(-100);
	}
}
