package Builder;
//package Shape;
//import java.awt.Color;
//import java.util.ArrayList;
//
//public class Circle implements ShapePlan{
//	private Color color;
//	private int radius;
//	private int x;
//	private int y;
//	private String value;
//	
//	public Circle() {
//	}
//
//	@Override
//	public void create(int radius)
//	{
//		this.setX(0);
//		this.setY(0);
//		this.setRadius(radius);
//		this.setColor(Color.BLUE);
//		this.setValue("Circle");
//	}
//	
//	@Override
//	public void move(int x, int y)
//	{
//		System.out.println("move");
//		setX(x);
//		setY(y);
//	}
//
//	@Override
//	public void draw( ) {
//		System.out.println("draw");
//			System.out.printf("%s, Color: %s, Origin: (%d, %d), Radius: %d\n", 
//					this.getValue(),this.getColor(), this.getX(), this.getY(), this.getRadius());
//	}
//
//	@Override
//	public void color(Color color) {
//		System.out.println("color");
//		this.setColor(color);
//		
//	}
//
//	@Override
//	public void delete( ArrayList<ShapePlan> drawingList) {
////		int index = 0;
////		for(ShapePlan n : drawingList)
////		{
////			if(n.equals(shape)) {
////				index++;
////				break;
////			}
////		}
////		
////		System.out.println("delete");
////		drawingList.remove(index);
////		//remove the shape from the drawinglist
////		setValue("no shape");
//	}
//
//	@Override
//	public void undo() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public int getRadius() {
//		return radius;
//	}
//
//	public void setRadius(int radius) {
//		this.radius = radius;
//	}
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//
//	public Color getColor() {
//		return color;
//	}
//
//	public void setColor(Color color) {
//		this.color = color;
//	}
//
//	public String getValue() {
//		return value;
//	}
//
//	public void setValue(String value) {
//		this.value = value;
//	}
//
//	@Override
//	public void create(int width, int height) {
//		
//	}
//}
