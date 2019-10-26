package Command;

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

	}
}
