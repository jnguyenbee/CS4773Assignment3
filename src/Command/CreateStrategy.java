package Command;

import Builder.CircleBuilder;
import Builder.RectangleBuilder;
import Builder.Shape;
import Builder.ShapeBuilder;
import Builder.ShapeEngineer;

public interface CreateStrategy {
	Shape create(int firstDimension, int secondDimension);
}

class CreateCircleStrategy implements CreateStrategy{
	@Override
	public Shape create(int firstDimension,int secondDimension) {
		ShapeBuilder builder = new CircleBuilder(firstDimension);
		ShapeEngineer engineer = new ShapeEngineer(builder);
		engineer.makeShape();
		return engineer.getShape();
	}
}

class CreateRectangleStrategy implements CreateStrategy{

	@Override
	public Shape create(int firstDimension, int secondDimension) {
		ShapeBuilder builder = new RectangleBuilder(firstDimension, secondDimension);
		ShapeEngineer engineer = new ShapeEngineer(builder);
		engineer.makeShape();
		return engineer.getShape();
	}

}
