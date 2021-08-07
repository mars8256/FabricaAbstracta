package edu.uspg.factory;

import edu.uspg.inter.IShape;
import edu.uspg.model.Rectangle;
import edu.uspg.model.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public IShape getIShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
