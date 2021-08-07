package edu.uspg.factory;

import edu.uspg.inter.IShape;

public abstract class AbstractFactory {
	public abstract IShape getIShape(String shapeType);
}
