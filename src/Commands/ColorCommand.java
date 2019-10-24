package Commands;

import java.awt.Color;

public class ColorCommand implements Command{

	Shape theShape;
	Color color;
	public ColorCommand (Shape newShape, Color newcolor)
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
