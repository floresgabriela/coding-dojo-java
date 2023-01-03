package com.java.caranddriver;

public class Driver extends Car {
	
	public void drive() {
		gas--;
		status();
	}
	
	public void boost() {
		gas -= 3;
		status();
	}
	
	public void refuel() {
		gas += 2;
		status();
	}
	
}
