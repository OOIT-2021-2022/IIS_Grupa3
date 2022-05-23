package geometry;

import java.awt.Graphics;

public class Circle extends Shape {
	private Point center;
	protected int radius;

	public Circle() {

	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		super.setSelected(selected); // ili setSelected(selected); i to je poziv metode a ne konstruktora
	}

	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocni = (Circle) obj;
			if (this.center.equals(pomocni.center) && this.radius == pomocni.radius) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public double area() {
		return radius * getRadius() * Math.PI;
	}

	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public boolean contains(int x, int y) {
		return center.distance(x, y) <= radius;
	}

	public boolean contains(Point clickPoint) {
		return center.distance(clickPoint.getX(), clickPoint.getY()) <= radius;
	}

	public void draw(Graphics g) {
		g.drawOval(center.getX() - radius, center.getY() - radius, 
				2 * radius, 2 * radius);
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.center.moveTo(x, y);		
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.center.moveBy(byX, byY);		
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Circle) {
			Circle shapeToCompare = (Circle)obj;
			return (int)(this.area() - shapeToCompare.area());
		}
		return 0;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws Exception {
		
		if(radius < 0) {
			throw new Exception("Radius mora biti veci od 0!");
		}
		this.radius = radius;
	}

	public String toString() {
		// Center=(x,y), radius= radius
		return "Center=" + center.toString() + ", radius=" + radius;
	}



}
