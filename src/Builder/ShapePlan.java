package Builder;



import java.awt.Color;
import java.util.ArrayList;

public interface ShapePlan {


	public void draw();

	public void color(Color color);

	public void delete(ArrayList<ShapePlan> drawingList);

	public void undo();

	public void move(int x, int y);

	public void create(int radius);

	public void create(int width, int height);

}
