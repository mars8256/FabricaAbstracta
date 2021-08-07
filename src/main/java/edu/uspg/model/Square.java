package edu.uspg.model;

import edu.uspg.inter.IShape;

public class Square implements IShape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");		
	}

}
