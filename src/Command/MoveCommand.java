package Command;

public class MoveCommand implements Command{
	ShapeCommandInterface shape;
	private int x;
	private int y;
	public MoveCommand(ShapeCommandInterface shape, int x, int y) {
		this.shape = shape;
		this.x = x;
		this.y = y;

	}

	@Override
	public void execute() {
		shape.move(this.x, this.y);
	}

	@Override
	public void undo() {


	}

}
