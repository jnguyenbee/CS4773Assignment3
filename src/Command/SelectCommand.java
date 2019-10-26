package Command;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Stack;

public class SelectCommand  implements Command{

	ShapeCommandInterface shape;
	static ArrayList<ShapeCommandInterface> selected = new ArrayList();

	public SelectCommand(ShapeCommandInterface shape)
	{
		this.shape = shape;

	}
	@Override
	public void execute() {
		shape.select();
		selected.add(this.shape);
	}

	@Override
	public void undo() {
		int prevSelectIndex = 0;
		for(int i = 0; i < selected.size(); i++)
		{
			if(selected.get(i).equals(this.shape)){
				this.shape = selected.get(prevSelectIndex);
				break;
			}
			prevSelectIndex = i;
		}
	}

}
