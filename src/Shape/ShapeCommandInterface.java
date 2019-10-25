package Shape;

import java.awt.Color;

public interface ShapeCommandInterface {

	public void create();

	public void draw();

	public void color(Color color);

	public void delete();

	public void undo();

	public void move();

}
