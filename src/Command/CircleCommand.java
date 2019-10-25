package Command;

import java.awt.Color;

import Builder.*;


public class CircleCommand implements ShapeCommandInterface{

	Shape shape;
	private int radius;
	public CircleCommand(int radius) {
		this.radius = radius;
	}

	@Override
	public void create() {
		System.out.println("create");
		ShapeBuilder builder = new CircleBuilder(this.radius);
		ShapeEngineer engineer = new ShapeEngineer(builder);
		engineer.makeShape();
		this.shape = engineer.getShape();
	}

	@Override
	public void draw() {
		System.out.println("draw");
		System.out.printf("Circle, Color: %s, Origin: (%d, %d), Radius: %d\n",
				this.shape.getColor(), this.shape.getX(), this.shape.getY(), this.shape.getRadius());
	}

	@Override
	public void color(Color color) {
		System.out.println("color");
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
