package Command;

import java.awt.Color;

import Builder.*;
import Builder.Shape;

public class CircleCommand extends ShapeCommand{


	private int radius;

	public CircleCommand(int radius) {
		this.radius = radius;
	}

	@Override
	public void create() {
		ShapeBuilder builder = new CircleBuilder(this.radius);
		ShapeEngineer engineer = new ShapeEngineer(builder);
		engineer.makeShape();
		this.shape = engineer.getShape();
	}

	@Override
	public void draw() {
		if(shape.getNoShape() != true) {
		System.out.printf("Circle, Color: %s, Origin: (%d, %d), Radius: %d\n",
				this.shape.getColor(), this.shape.getX(), this.shape.getY(), this.shape.getRadius());
		}
	}
}
