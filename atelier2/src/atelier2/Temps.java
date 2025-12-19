package atelier2;

public class Temps {
	    private int heure;
	    private int minute;
	    private int seconde;

	    
	    public Temps(int heure) {
	        this.heure = heure;
	        this.minute = 0;
	        this.seconde = 0;
	    }

	   
	    public Temps(int heure, int minute) {
	        this(heure);      
	        this.minute = minute;
	    }

	    
	    public Temps(int heure, int minute, int seconde) {
	        this(heure, minute);  
	        this.seconde = seconde;
	    }

	   
	    public void affiche() {
	        System.out.println("Il est " + heure + " heures " + minute + " minutes " + seconde + " secondes");
	    }

	    // Test
	    public static void main(String[] args) {
	        Temps t = new Temps(10);
	        t.affiche();

	        t = new Temps(10, 12);
	        t.affiche();

	        t = new Temps(10, 12, 45);
	        t.affiche();
	    }
	}



