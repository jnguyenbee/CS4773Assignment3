package Command;

import java.awt.Color;
import Builder.Shape;
public class ColorCommand implements Command{

	//TODO: Check the color;
	ShapeCommandInterface shape;
	Color prevShapeColor;
	Color currentColor;
	
	public ColorCommand(ShapeCommandInterface shape, Color newColor) {
		this.shape = shape;
		this.currentColor = newColor;
		this.prevShapeColor = this.shape.getShape().getColor();
	}

	@Override
	public void execute() {
		shape.color(this.currentColor);
	}

	@Override
	public void undo() {
		this.shape.getShape().setColor(prevShapeColor);
	}


}
