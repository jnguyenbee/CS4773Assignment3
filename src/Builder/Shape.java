package Builder;

import java.awt.Color;
import java.util.ArrayList;

public class Shape implements ShapePlan	{
	private Color color;
	private int x;
	private int y;
	private int radius;
	private int height;
	private int width;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawed");
	}

	@Override
	public void color(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public void delete (ArrayList<ShapePlan> drawingList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}

	@Override
	public void create(int radius) {
		// TODO Auto-generated method stub
		this.radius = radius;
		
	}

	@Override
	public void create(int width, int height) {
		// TODO Auto-generated method stub
		this.width = width;
		this.height = height;
		
	}
	
	///////////////////////////////GETTER AND SETTER/////////////////////////////
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

}
