package Command;

import Builder.Shape;

public interface DrawStrategy {
	void draw(Shape shape);
}

class DrawCircleStrategy implements DrawStrategy {

	@Override
	public void draw(Shape shape) {
		System.out.println("draw");
		System.out.printf("Circle, Color: %s, Origin: (%d, %d), Radius: %d\n",
				shape.getColor(), shape.getX(), shape.getY(), shape.getRadius());
		
	}
	
}

class DrawRectangleStrategy implements DrawStrategy {

	@Override
	public void draw(Shape shape) {
		System.out.println("draw");
		System.out.printf("Rectangle, Color: %s, Origin: (%d, %d), Width: %d, Height: %d\n",
			shape.getColor(), shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight());
		
	}
	
}