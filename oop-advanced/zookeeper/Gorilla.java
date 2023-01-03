package com.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something.");
		setEnergyLevel(getEnergyLevel() - 5);
	}
	
	public void eatBananas() {
		System.out.println("Gorilla is satisfied.");
		setEnergyLevel(getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("Gorilla climbed a tree.");
		setEnergyLevel(getEnergyLevel() - 10);
	}
}