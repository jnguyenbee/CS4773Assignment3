package Shape;

import java.awt.Color;

import Builder.CircleBuilder;
import Builder.Director;
import Builder.Shape;
import Builder.ShapeBuilder;

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
		Director director = new Director(builder);
		director.buildShape();
		this.shape = director.getShape();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

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
	public void move() {
		// TODO Auto-generated method stub

	}


}
