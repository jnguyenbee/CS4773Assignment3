package Commands;

import java.util.ArrayList;

public class DrawCommand implements Command{
	Shape theShape;

	public DrawCommand (Shape newShape)
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
