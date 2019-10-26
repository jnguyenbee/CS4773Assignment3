package Command;

import java.awt.Color;
import Builder.Shape;
import java.util.ArrayList;

public interface ShapeCommandInterface {

	public void create();

	public void draw();

	public void color(Color color);

	public void delete();

	public void undo();

	public void move(int x, int y);

	public void select();

	public Shape getShape();
}
