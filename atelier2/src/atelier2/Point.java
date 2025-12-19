package atelier2;

public class Point {
	
	    private double x;
	    private double y;

	   
	    public Point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	   
	    public void affiche() {
	        System.out.println("p = (" + x + " , " + y + ")");
	    }

	   
	    public static double distance(Point p1, Point p2) {
	        double dx = p2.x - p1.x;
	        double dy = p2.y - p1.y;
	        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	    }
	}

	
	class TestPoint {
	    public static void main(String[] args) {
	        Point p1 = new Point(1.0, 3.0);
	        Point p2 = new Point(5.0, 6.0);

	        double d = Point.distance(p1, p2);
	        p1.affiche();
	        p2.affiche();

	        System.out.println("Distance entre p1 et p2 = " + d);
	    }
	}



