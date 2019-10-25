package Commands;

import java.awt.Color;

import Builder.ShapePlan;

public class ColorCommand implements Command{

	ShapePlan theShape;
	Color color;
	public ColorCommand (ShapePlan newShape, Color newcolor)
	{
		this.theShape = newShape;
		this.color = newcolor;
	}

	@Override
	public void execute() {
		this.theShape.color(this.color);

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
