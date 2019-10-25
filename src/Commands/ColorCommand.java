package Commands;

import java.awt.Color;


public class ColorCommand implements Command{

	ShapePlan theShape;
	Color color;
	public ColorCommand (Shape newShape, String newColor)
	{
		this.theShape = newShape;
		this.color = getColor(newColor);
	}

	@Override
	public void execute() {
		this.theShape.color(this.color);

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

	public Color getColor(String newColor)
	{
		String color = newColor.toUpperCase();
		//Red, Blue, Yellow, Orange, Green
		switch(color)
		{
			case "RED":
				return Color.RED;
			case "BLUE":
				return Color.BLUE;
			case "YELLOW":
				return Color.YELLOW;
			case "ORANGE":
				return Color.ORANGE;
			case "GREEN":
				return Color.GREEN;
			default:
				System.err.print("Invalid Color");
				return null;
		}
	}
}
