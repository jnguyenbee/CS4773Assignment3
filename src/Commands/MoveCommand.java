package Commands;

import Shape.Shape;

public class MoveCommand  implements Command{
	Shape theShape;
	int x;
	int y;
	public MoveCommand (Shape newShape, int newX, int newY)
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
