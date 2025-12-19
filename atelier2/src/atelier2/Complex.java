package atelier2;

public class Complex {
	
	    private double re;  
	    private double im;  

	    
	    public Complex(double re, double im) {
	        this.re = re;
	        this.im = im;
	    }

	    
	    public String info() {
	        return re + " + " + im + "i";
	    }

	    
	    public Complex produit(Complex z) {
	        double r = this.re * z.re - this.im * z.im;
	        double i = this.re * z.im + this.im * z.re;
	        return new Complex(r, i);
	    }

	    
	    public static Complex produit(Complex z1, Complex z2) {
	        double r = z1.re * z2.re - z1.im * z2.im;
	        double i = z1.re * z2.im + z1.im * z2.re;
	        return new Complex(r, i);
	    }
	}

	
	class TestComplex {
	    public static void main(String[] args) {
	        Complex z1 = new Complex(1.0, 2.0);
	        System.out.println("z1=" + z1.info());

	        Complex z2 = new Complex(2.0, 1.0);
	        System.out.println("z2=" + z2.info());

	        Complex z3 = z1.produit(z2);
	        System.out.println("z1 x z2=" + z3.info());

	        Complex z4 = Complex.produit(z2, z1);
	        System.out.println("z2 x z1=" + z4.info());
	    }
	}



