package geometry;

public class Donut extends Circle {
	
	private int innerRadius;
	
	
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(radius, center); //potrebno je radius pa center u zagradi jer je u circle prvo definisano kod publica radius pa centar
		this.innerRadius = innerRadius;
	}
	
	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	
	@Override
	public boolean contains(int x, int y) {
		Point click = new Point(x, y);
		return super.contains(x, y) && center.distance(center) >= innerRadius; 
	}
	
	@Override
	public boolean contains(Point click) {
		return contains(click.getX(), click.getY());
	}
	
	@Override
	public String toString() {
		return super.toString() + ", innerRadius: " + innerRadius;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Donut) {
			Donut temp = (Donut)o;
			if(radius == temp.getRadius() && innerRadius == temp.getInnerRadius()) {
				return true;
			}
		}
		return false;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center, radius, innerRadius);
		this.selected = selected;
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	
	
	
}
