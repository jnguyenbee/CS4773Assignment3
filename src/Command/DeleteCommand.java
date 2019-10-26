package Command;

import java.util.ArrayList;

public class DeleteCommand implements Command{

	ShapeCommandInterface shape;
	public DeleteCommand(ShapeCommandInterface shape) {
		this.shape = shape;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		shape.delete();
	}

	@Override
	public void undo() {
		shape.getShape().setNoShape(Boolean.FALSE);
	}
}
