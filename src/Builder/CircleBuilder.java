package Builder;

import java.awt.Color;

public class CircleBuilder implements ShapeBuilder {
	private Shape circle;
	private int radius;

	public CircleBuilder(int radius)
	{
		this.radius = radius;
		this.circle = new Shape();
	}

	@Override
	public void buildXCor() {
		circle.setX(0);
	}

	@Override
	public void buildYCor() {
		circle.setY(0);

	}

	@Override
	public void buildRadius() {
		circle.setRadius(this.radius);

	}

	@Override
	public void buildWidth() {
		circle.setWidth(0);

	}

	@Override
	public void buildHeight() {
		circle.setHeight(0);

	}

	@Override
	public void buildColor() {
		circle.setColor(Color.BLUE);

	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return this.circle;
	}

}
