package Builder;

public class ShapeEngineer {

	private ShapeBuilder shapeBuilder;

	//Either CircleBuilder or RectangleBuilder Specification is sent in
	public ShapeEngineer(ShapeBuilder shapeBuilder) {
		this.shapeBuilder = shapeBuilder;
	}

	public Shape getShape() {
		return this.shapeBuilder.getShape();
	}

	public void makeShape() {
		this.shapeBuilder.buildColor();
		this.shapeBuilder.buildHeight();
		this.shapeBuilder.buildWidth();
		this.shapeBuilder.buildRadius();
		this.shapeBuilder.buildXCor();
		this.shapeBuilder.buildYCor();
	}
}
