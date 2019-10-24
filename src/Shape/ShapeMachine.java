package Shape;
public class ShapeMachine {

	public static Shape getShape(String shape)
	{
		switch(shape)
		{
			case "RECTANGLE":
				return new Rectangle();
			case "CIRCLE":
				return new Circle();
		}
		return null;
	}
}
