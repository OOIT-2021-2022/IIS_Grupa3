package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String args[]) {
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawingPanel = new Drawing();
		frame.getContentPane().add(drawingPanel);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {
		/*
		 * Point p = new Point(300,300); p.draw(g); g.setColor(Color.red); Point
		 * startPoint=new Point(100,200); Line l = new Line(startPoint, new
		 * Point(300,400)); l.draw(g); g.setColor(Color.black); Donut d = new Donut(new
		 * Point(350,450), 70, 50, true); d.draw(g);
		 */

		// Vezbe 8.
		Point p = new Point(50, 50);

		Line l1 = new Line(new Point(100, 100), new Point(200, 200));

		Rectangle r1 = new Rectangle(l1.getEndPoint(), 100, 50);

		Circle c1 = new Circle(new Point(500, 100), 80);

		Donut d1 = new Donut(new Point(800, 100), 50, 25, true);

		Rectangle k1 = new Rectangle(new Point(500, 500), 50, 50);

		// Zadatak 1.
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p);
		shapes.add(l1);
		shapes.add(c1);
		shapes.add(d1);
		shapes.add(k1);
		Iterator<Shape> it = shapes.iterator();
		while (it.hasNext()) {
			it.next().moveBy(10, 0);
		}
		// Collections.sort(shapes);

		// Zadatak 2.
		shapes.get(3).draw(g);

		shapes.get(shapes.size() - 1).draw(g);

		shapes.remove(1);
		// pomera se lista
		shapes.get(1).draw(g);

		shapes.get(3).draw(g);

		shapes.add(3, l1);
		
		try {
			c1.setRadius(-10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("Sve je ok");
		
		System.out.println("Fali 4. zadatak");

	}

}
