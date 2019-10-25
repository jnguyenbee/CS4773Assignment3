package Shape;

import java.awt.Color;

import Builder.*;


public class Circle implements ShapeCommandInterface{

	Shape shape;
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		//this.shape.setColor(color);
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

	}

}
