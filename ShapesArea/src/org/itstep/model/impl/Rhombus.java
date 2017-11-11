package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Rhombus implements Shape{
	private int side;
	private int height;

	public void printArea() {
		System.out.println("Area of this rhombus is " + side*height + " sq.m.");
		
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
