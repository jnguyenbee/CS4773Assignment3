package Commands;

import Builder.ShapePlan;

public class MoveCommand  implements Command{
	ShapePlan theShape;
	int x;
	int y;
	public MoveCommand (ShapePlan newShape, int newX, int newY)
	{
		this.theShape = newShape;
		this.x = newX;
		this.y = newY;
	}

	public void execute()
	{
		theShape.move(this.x, this.y);
	}

	public void undo()
	{
		theShape.undo();
	}
}
