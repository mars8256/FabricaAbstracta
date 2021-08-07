package edu.uspg.factory;

import edu.uspg.inter.IShape;
import edu.uspg.model.RectangleRounded;
import edu.uspg.model.SquareRounded;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public IShape getIShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RectangleRounded();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new SquareRounded();
		}
		return null;
	}

}
