package Command;

public class CreateCommand implements Command{
	ShapeCommandInterface shape;
	//private Boolean flag;
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
		shape.getShape().setNoShape(Boolean.TRUE);
	}
}
