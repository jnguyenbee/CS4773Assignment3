package Commands;

import java.util.ArrayList;

public class DeleteCommand implements Command{

	Shape deleteShape;
	ArrayList<Shape> drawingList;
	
	public DeleteCommand(Shape shape, ArrayList<Shape> newDrawingList)
	{
		this.drawingList = newDrawingList;
		this.deleteShape = shape;
		
	}
	// Delete from the list.
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		deleteShape.delete(this.deleteShape,this.drawingList);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
