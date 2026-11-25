package geometry;

public class Circle extends Shape{
	
	protected int radius;
	protected Point center;
	
	
	public Circle() {
		
	}
	
	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	
	public Circle(int radius, Point center, boolean selected) {
		this (radius, center);
		this.selected = selected;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		center.moveTo(x, y);
	}

	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		center.moveBy(byX, byY);
	}
	
	public boolean contains(int x, int y) {
		return center.distance(new Point(x, y)) <= radius;
	}
	
	public boolean contains(Point click) {
		return contains(click.getX(), click.getY());
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	@Override 
	public String toString() {
		return String.format("(%s, %s), radius = %s",
				center.getX(), center.getY(), radius);

	}
	
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		if (o instanceof Circle) {
			Circle temp = (Circle) o;
			return (int) (area() - temp.area());
		}
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (o instanceof Circle) {
	        Circle temp = (Circle) o;
	        if (this.radius == temp.getRadius()) {
	            return true;
	        }
	    } 
	    return false;
	}
	
	public int getRadius() {
		return radius;
	}
	public Point getCenter() {
		return center;
	}
	
	public void setRadius(int raidus) {
		this.radius = raidus;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	

	
	
}
