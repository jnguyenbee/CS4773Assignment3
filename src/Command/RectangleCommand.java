package Command;

import java.awt.Color;

import Builder.*;

public class RectangleCommand extends ShapeCommand{

	private int width;
	private int height;

	public RectangleCommand (int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void create() {
			ShapeBuilder builder = new RectangleBuilder(this.width, this.height);
			ShapeEngineer engineer = new ShapeEngineer(builder);
			engineer.makeShape();
			this.shape = engineer.getShape();
	}

	@Override
	public void draw() {
		if(shape.getNoShape() != true) {
		System.out.printf("Rectangle, Color: %s, Origin: (%d, %d), Width: %d, Height: %d\n",
			this.shape.getColor(), this.shape.getX(), this.shape.getY(), this.shape.getWidth(), this.shape.getHeight());
		}
	}


}
