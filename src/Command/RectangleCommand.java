package Command;

import java.awt.Color;

import Builder.*;

public class RectangleCommand extends ShapeCommand{

	private int width;
	private int height;

	public RectangleCommand (int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void create() {
		createType = new CreateRectangleStrategy();
		this.shape = createType.create(this.width,this.height);
	}

	@Override
	public void draw() {
		drawType = new DrawRectangleStrategy();
		tryToDraw();
	}


}
