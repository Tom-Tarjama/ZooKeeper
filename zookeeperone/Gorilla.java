package com.codingdojo.zookeeperone;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The gorilla threw feces.");
		this.setEnergyLevel(-5);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla ate a banana.");
		this.setEnergyLevel(10);
	}
	
	public void climb() {
		System.out.println("The gorilla climbed a tree.");
		this.setEnergyLevel(-10);
	}
}
