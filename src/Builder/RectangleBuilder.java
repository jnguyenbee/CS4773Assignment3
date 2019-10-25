package Builder;

import java.awt.Color;

public class RectangleBuilder implements ShapeBuilder {

	private Shape rectangle;
	private int height;
	private int width;

	public RectangleBuilder(int width, int height)
	{
		this.rectangle = new Shape();
		this.width = width;
		this.height = height;
	}

	@Override
	public void buildXCor() {
		rectangle.setX(0);
	}

	@Override
	public void buildYCor() {
		rectangle.setY(0);

	}

	@Override
	public void buildRadius() {
		rectangle.setRadius(0);

	}

	@Override
	public void buildWidth() {
		rectangle.setWidth(this.width);

	}

	@Override
	public void buildHeight() {
		rectangle.setHeight(this.height);

	}

	@Override
	public void buildColor() {
		rectangle.setColor(Color.RED);

	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return this.rectangle;
	}
}
