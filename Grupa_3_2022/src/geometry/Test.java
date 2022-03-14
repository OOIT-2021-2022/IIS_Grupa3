package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println(i);
		Point point1 = new Point();
		//System.out.println(point1.x);
		//point1.x=10;
		//System.out.println(point1.x);
		
		point1.setX(10);
		System.out.println("X koordinata point1: "+point1.getX());
		point1.setY(20);
		System.out.println("Y koordinata point1: "+point1.getY());
		
		point1.distance(15,20);
		
		
	}

}
