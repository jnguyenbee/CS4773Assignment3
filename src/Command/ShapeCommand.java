package Command;

import java.awt.Color;

import Builder.CircleBuilder;
import Builder.Shape;
import Builder.ShapeBuilder;
import Builder.ShapeEngineer;

public abstract class ShapeCommand implements ShapeCommandInterface{
	Shape shape;
	
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

	}
}
