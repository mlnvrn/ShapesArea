package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Triangle implements Shape{
	private int base;
	private int height;
	private double n = 0.5; 

	public void printArea() {
		System.out.println("Area of this triangle is " + (n*base)*height + " sq.m.");
	}	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
		
}
