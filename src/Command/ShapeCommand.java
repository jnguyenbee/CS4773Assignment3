package Command;

import java.awt.Color;
import java.util.ArrayList;

import Builder.CircleBuilder;
import Builder.Shape;
import Builder.ShapeBuilder;
import Builder.ShapeEngineer;

public abstract class ShapeCommand implements ShapeCommandInterface{
	Shape shape;

	public void create() {

	}

	public void draw() {

	}

	@Override
	public void color(Color color) {
		if(Color.RED == color || Color.BLUE == color
				|| Color.YELLOW == color || Color.ORANGE == color
				|| Color.GREEN == color)
			{
				this.shape.setColor(color);
			}

	}


	public Shape getShape()
	{
		return this.shape.getShape();
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		this.shape.setNoShape(Boolean.TRUE);

	}

	public void select()
	{
		if(this.shape.getNoShape() == true)
		{
			System.out.println("ERROR: invalid shape for SELECT");
		}

	}

	@Override
	public void undo() {

	}

	@Override
	public void move(int x, int y) {

		this.shape.setX(x);
		this.shape.setY(y);
	}

}
