package Command;

import java.awt.Color;

import Builder.*;

public class RectangleCommand extends ShapeCommand{

	Shape shape;
	private int width;
	private int height;

	public RectangleCommand (int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void create() {
		System.out.println("create");
			ShapeBuilder builder = new RectangleBuilder(this.width, this.height);
			ShapeEngineer engineer = new ShapeEngineer(builder);
			engineer.makeShape();
		  this.shape = engineer.getShape();
	}

	@Override
	public void draw() {
		System.out.println("draw");
		System.out.printf("Rectangle, Color: %s, Origin: (%d, %d), Width: %d, Height: %d\n",
			this.shape.getColor(), this.shape.getX(), this.shape.getY(), this.shape.getWidth(), this.shape.getHeight());
		
	}

}
