package Command;

import java.awt.Color;

public class MoveCommand implements Command{
	ShapeCommandInterface shape;
	private int prevX;
	private int prevY;
	private int x;
	private int y;
	public MoveCommand(ShapeCommandInterface shape, int x, int y) {
		this.shape = shape;
		this.x = x;
		this.y = y;
		this.prevX = this.shape.getShape().getX();
		this.prevY = this.shape.getShape().getY();
	}

	@Override
	public void execute() {
		shape.move(this.x, this.y);
	}

	@Override
	public void undo() {
		shape.getShape().setX(prevX);
		shape.getShape().setY(prevY);
	}

}
