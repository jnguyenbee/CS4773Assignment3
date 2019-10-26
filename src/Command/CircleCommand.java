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
		createType = new CreateCircleStrategy();
		this.shape = createType.create(this.radius, 0);
	}

	@Override
	public void draw() {
		drawType = new DrawCircleStrategy();
		tryToDraw();
	}	
}
