package Shape;

import java.awt.Color;

import Builder.*;

public class Rectangle implements ShapeCommandInterface{

	Shape shape;
	private int width;
	private int height;

	public Rectangle (Shape newShape,int width, int height) {
		this.shape = newShape;
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

	@Override
	public void color(Color color) {
		// TODO Auto-generated method stub
		this.shape.setColor(color);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

}
