package Command;

import Shape.ShapeCommandInterface;

public class DrawCommand implements Command{

	ShapeCommandInterface shape;
	public DrawCommand(ShapeCommandInterface shape) {
		this.shape = shape;
	}

	@Override
	public void execute() {
		shape.draw();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}