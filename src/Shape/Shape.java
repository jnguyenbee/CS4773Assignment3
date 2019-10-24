package Shape;



import java.awt.Color;
import java.util.ArrayList;

public interface Shape {


	public void draw(Shape shape);

	public void color(Color color);

	public void delete(Shape shape, ArrayList<Shape> drawingList);

	public void undo();

	public void move(int x, int y);

	// Overload ?? need to rethink about this again
	public void create(int radius);

	public void create(int width, int height);

}
