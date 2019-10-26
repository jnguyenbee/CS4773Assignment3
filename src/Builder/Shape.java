package Builder;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shape 	{
	private Color color;
	private int x;
	private int y;
	private int radius;
	private int height;
	private int width;
	private Boolean noShape;
	private HashMap<Color, String> colorMap = new HashMap<Color,String>();
	
	private void populateColors() {
		colorMap.put(Color.BLUE, "BLUE");
		colorMap.put(Color.RED, "RED");
		colorMap.put(Color.YELLOW, "YELLOW");
		colorMap.put(Color.ORANGE, "ORANGE");
		colorMap.put(Color.GREEN, "GREEN");
		
	}
	///////////////////////////////GETTER AND SETTER/////////////////////////////
	public String getColorString(Color color) {
		populateColors();
		return colorMap.get(color);
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setNoShape(Boolean value) {
		this.noShape = value;

	}

	public Boolean getNoShape() {
		return noShape;

	}

	public Shape getShape() {
		// TODO Auto-generated method stub
		return this;
	}

}
