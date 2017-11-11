package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Square implements Shape{
	private int side;

	public void printArea() {
		System.out.println("Area of this square is " + side*side + " sq.m.");		
		
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
