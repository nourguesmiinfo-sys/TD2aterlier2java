package atelier2;

public class XYZ {
	
	    private int x;
	    private static int y;
	    private int z;

	   
	    XYZ() {
	        x = 0;
	        y++;
	        z = y;
	    }

	   
	    XYZ(int x) {
	        this.x = x;
	        y++;
	        z = y;
	    }

	    void affiche() {
	        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
	    }
	}

	class TestXYZ {
	    public static void main(String[] args) {
	        XYZ a = new XYZ();
	        a.affiche();

	        XYZ b = new XYZ(1);
	        a.affiche();
	        b.affiche();
	    }
	}



