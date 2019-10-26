package Command;

import java.awt.Color;

import Builder.*;


public class CircleCommand extends ShapeCommand{


	private int radius;

	public CircleCommand(int radius) {
		this.radius = radius;
	}

	@Override
	public void create() {
//		System.out.println("create");
//		ShapeBuilder builder = new CircleBuilder(this.radius);
//		ShapeEngineer engineer = new ShapeEngineer(builder);
//		engineer.makeShape();
//		this.shape = engineer.getShape();
		
		createType = new CreateCircleStrategy();
		this.shape = createType.create(this.radius, 0);
	}

	@Override
	public void draw() {
//		System.out.println("draw");
//		System.out.printf("Circle, Color: %s, Origin: (%d, %d), Radius: %d\n",
//				this.shape.getColor(), this.shape.getX(), this.shape.getY(), this.shape.getRadius());
//	}
		drawType = new DrawCircleStrategy();
		tryToDraw();
	}	

}
