package Command;

import java.util.ArrayList;

public class SelectCommand  implements Command{

	ShapeCommandInterface shape;
	public SelectCommand(ShapeCommandInterface shape)
	{
		this.shape = shape;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		shape.select();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
	}

}
