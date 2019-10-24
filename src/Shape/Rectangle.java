package Shape;
import java.awt.Color;
import java.util.ArrayList;

public class Rectangle implements Shape{
	private Color color;
	private int w;
	private int h;
	private int x;
	private int y;
	private String value;
	
	public Rectangle() {
	}
	
	@Override
	public void create(int width, int height) {
		this.setX(0);
		this.setY(0);
		this.setWidth(width);
		this.setHeight(height);
		this.setColor(Color.RED);
		this.setValue("Rectangle");
		
	}
	
	@Override
	public void draw(Shape shape) {
		System.out.println("draw");
	
		System.out.printf("%s, Color: %s, Origin: (%d, %d), Width: %d, Height: %d\n", 
				this.getValue(),this.getColor(), this.getX(), this.getY(), this.getWidth(), this.getHeight());
		
	}

	@Override
	public void color(Color color) {
		System.out.println("color");
		this.setColor(color);
	}

	@Override
	public void delete(Shape shape,	ArrayList<Shape> drawingList) {
		System.out.println("delete");
		
		//remove the shape from the drawinglist
		setValue("no shape");
	}

	@Override
	public void undo() {
		
	}

	@Override
	public void move(int x, int y) {
		System.out.println("move");
		setX(x);
		setY(y);
	}

	@Override
	public void create(int radius) {
		// TODO Auto-generated method stub
		
	}

	public int getWidth() {
		return w;
	}

	public void setWidth(int w) {
		this.w = w;
	}

	public int getHeight() {
		return h;
	}

	public void setHeight(int h) {
		this.h = h;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	

}
