package Commands;

import Shape.Shape;

public class CreateCommand implements Command{
		Shape theShape;
		int dimension;

		public CreateCommand (Shape newShape, int newDimensions)
		{
			this.theShape = newShape;
			this.dimension = newDimensions;
		}
		
		public void execute()
		{
			theShape.create(this.dimension);
		}
		
		public void undo()
		{
			theShape.undo();
		}
}
