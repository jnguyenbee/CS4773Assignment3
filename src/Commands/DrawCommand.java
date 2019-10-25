package Commands;

import java.util.ArrayList;

import Builder.ShapePlan;

public class DrawCommand implements Command{
	ShapePlan theShape;

	public DrawCommand (ShapePlan newShape)
	{
		this.theShape = newShape;
	}

	public void execute()
	{
		theShape.draw(this.theShape);
	}

	public void undo()
	{
		theShape.undo();
	}
}
