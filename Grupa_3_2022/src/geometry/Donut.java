package geometry;

import java.awt.Graphics;

public class Donut extends Circle {
	private int innerRadius;

	public Donut() {

	}

	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		/*
		 * setCenter(center); // ostalo je private this.radius = radius; // moze jer je
		 * protected setSelected(selected); this.innerRadius = innerRadius;
		 */
		super(center, radius, selected);
		this.innerRadius = innerRadius;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			Donut pomocni = (Donut) obj;
			if (super.equals(pomocni) && this.innerRadius == pomocni.innerRadius) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}
	public boolean contains(int x, int y) {
		return super.contains(x, y) && getCenter().distance(x, y) <= innerRadius;
	}
	
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(getCenter().getX() - innerRadius, 
				getCenter().getY() - innerRadius, 
				2 * innerRadius, 2 * innerRadius);
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public String toString() {
		// Center=(x,y), radius= radius, innerRadius= innerRadius
		return  super.toString() + ", innerRadius=" + innerRadius;
	}

}
