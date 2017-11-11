package org.itstep;

import org.itstep.model.impl.Circle;
import org.itstep.model.impl.Rhombus;
import org.itstep.model.impl.Square;
import org.itstep.model.impl.Triangle;

public class AppRunner {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		circle1.setRadius(20);
		circle1.printArea();
		
		Circle circle2 = new Circle();
		circle2.setRadius(15);
		circle2.printArea();
		
		Triangle triangle1 = new Triangle();
		triangle1.setBase(10);
		triangle1.setHeight(12);
		triangle1.printArea();
		
		Square square1 = new Square();
		square1.setSide(8);
		square1.printArea();
		
		Rhombus rhombus1 = new Rhombus();
		rhombus1.setHeight(11);
		rhombus1.setSide(3);
		rhombus1.printArea();

	}

}
