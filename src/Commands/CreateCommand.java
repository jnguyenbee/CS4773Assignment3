package Commands;

import Shape.Shape;
import Builder.ShapePlan;

public class CreateCommand implements Command{
		ShapePlan theShape;
		int dimension;

		public CreateCommand (ShapePlan newShape, int newDimensions)
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
