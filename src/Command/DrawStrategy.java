package Command;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import Builder.Shape;

public interface DrawStrategy {
	void draw(Shape shape);
}

class DrawCircleStrategy implements DrawStrategy {

	@Override
	public void draw(Shape shape) {
		if(shape.getNoShape() != true){
		System.out.printf("Circle, Color: %s, Origin: (%d, %d), Radius: %d\n",
				shape.getColorString(shape.getColor()), shape.getX(), shape.getY(), shape.getRadius());
		}
	}
}

class DrawRectangleStrategy implements DrawStrategy {

	@Override
	public void draw(Shape shape) {
			if(shape.getNoShape() != true){
				System.out.printf("Rectangle, Color: %s, Origin: (%d, %d), Width: %d, Height: %d\n",
				shape.getColorString(shape.getColor()), shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight());
		}
	}
}
