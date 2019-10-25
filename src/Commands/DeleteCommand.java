package Commands;

import java.util.ArrayList;

import Builder.ShapePlan;

public class DeleteCommand implements Command{

	ShapePlan deleteShape;
	ArrayList<ShapePlan> drawingList;
	
	public DeleteCommand(ShapePlan shape, ArrayList<ShapePlan> newDrawingList)
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
