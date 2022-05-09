package geometry;

import java.awt.Graphics;

public class Line extends Shape{
	private Point startPoint;
	private Point endPoint;

	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		//prvi nacin
		//this(startPoint, endPoint);
		//setSelected(selected);
		//drugi nacin
		super(selected);
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line pomocna = (Line) obj;
			if (this.startPoint.equals(pomocna.startPoint) && this.endPoint.equals(pomocna.endPoint))
				return true;
			else
				return false;
		} else
			return false;
	}

	public double length() {
		return this.startPoint.distance(endPoint.getX(), getEndPoint().getY());
	}
	
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(),
				endPoint.getX(), this.endPoint.getY());
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.startPoint.moveTo(x, y);
		this.endPoint.moveTo(x, y);
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.startPoint.moveBy(byX, byY);
		this.endPoint.moveBy(byX, byY);		
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Line) {
			Line shapeToCompare = (Line)obj;
			return (int)(this.length() - shapeToCompare.length());
		}
		return 0;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getStartPoint() {
		return this.startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public String toString() {
		return startPoint + "-- >" + endPoint;
	}

	public boolean contains(int x, int y) {
		return this.startPoint.distance(x, y) +
				this.endPoint.distance(x, y) - length() <= 2;
	}

	public boolean contains(Point clickPoint) {
		return this.startPoint.distance(clickPoint.getX(), clickPoint.getY()) +
				this.endPoint.distance(clickPoint.getX(), clickPoint.getY())
					- length() <= 2;
	}



}
