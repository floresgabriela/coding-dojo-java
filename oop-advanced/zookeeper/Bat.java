package com.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("*flying away*");
		setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("fire!");
		setEnergyLevel(getEnergyLevel() - 100);
	}
	
}