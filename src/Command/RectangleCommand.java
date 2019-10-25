package Command;

import java.awt.Color;

import Builder.*;

public class RectangleCommand implements ShapeCommandInterface{

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

	@Override
	public void color(Color color) {
		// TODO Auto-generated method stub
		if(Color.RED == color || Color.BLUE == color
				|| Color.YELLOW == color || Color.ORANGE == color
				|| Color.GREEN == color)
			{
				this.shape.setColor(color);
			}
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
		System.out.println("move");
		this.shape.setX(x);
		this.shape.setY(y);

	}

}
