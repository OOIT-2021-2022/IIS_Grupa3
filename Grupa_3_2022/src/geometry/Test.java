package geometry;

public class Test {

	public static void main(String[] args) {
		// Vezbe 2
		int i = 0;
		System.out.println(i);
		Point p = new Point();
		// System.out.println(point1.x);
		// point1.x=10;
		// System.out.println(point1.x);

		p.setX(10);
		System.out.println("X koordinata point1: " + p.getX());
		p.setY(20);
		System.out.println("Y koordinata point1: " + p.getY());

		p.distance(15, 20);

		// Vezbe 3
		// Point p -> x=10, y=20
		Point p1 = new Point();
		p1.setX(20);
		p1.setY(30);

		Line l1 = new Line();
		System.out.println(l1.isSelected());
		//System.out.println(l1.getStartPoint().getX());
		//System.out.println(l1.getEndPoint().getY());
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		System.out.println(l1.getStartPoint().getX());
		System.out.println(l1.getEndPoint().getY());
		System.out.println(l1.length());

	}

}
