package Command;

import Shape.ShapeCommandInterface;

public class CreateCommand implements Command{
	ShapeCommandInterface shape;
	public CreateCommand(ShapeCommandInterface shape)
	{
		this.shape = shape;
	}

	@Override
	public void execute() {
		shape.create();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
