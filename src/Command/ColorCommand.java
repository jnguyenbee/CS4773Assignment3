package Command;

import java.awt.Color;

public class ColorCommand implements Command{

	ShapeCommandInterface shape;
	Color color;
	public ColorCommand(ShapeCommandInterface shape, Color newColor) {
		this.shape = shape;
		this.color = newColor;
	}

	@Override
	public void execute() {
		shape.color(this.color);
	}

	@Override
	public void undo() {
		// TODO Create Undo.

	}
}
