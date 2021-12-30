import java.util.Scanner;

public class Rechner {

    private int erg = 0;    //Das Ergebniss der letzen Rechnung
    private Scanner sc = new Scanner(System.in);
    
    //Berechnet eine addition
    public int plus() {

        int x = eingabe("Bitte geben Sie den ersten Summand ein: ");

        int y = eingabe("Bitte geben Sie den zweiten Summand ein: ");

        this.erg = x+y;

        return erg;
    }

    //Berechnet eine Subtraktion
    public int minus() {
        int x = eingabe("Bitte geben Sie die erste Zahl ein: ");

        int y = eingabe("Bitte geben Sie den Subtrahend ein: ");

        this.erg = x-y;

        return erg;
    }

    //Berechent eine multiplikation
    public int multiplikation() {
        int x = eingabe("Bitte geben Sie den ersten Faktor ein: ");

        int y = eingabe("Bitte geben Sie den zweiten Faktor ein: ");

        this.erg = x*y;

        return erg;
    }

    //Berechnet eine division
    public int division() {
        int x = eingabe("Bitte geben Sie den Dividend ein: ");

        int y = 0;
        
        while(y==0) {
            y = eingabe("Bitte geben Sie den Divisor ein: ");
            if(y == 0) {
                System.out.println("Der Dvisor darf nicht 0 sein!");
            }
        }
        
        this.erg = x/y;

        return this.erg;
    }

    //Berechnet den Restwert
    public int mod() {
        int x = eingabe("Bitte geben Sie Dividend ein: ");

        int y = 0;
        
        while(y==0) {
            y = eingabe("Bitte geben Sie den Divisor ein: ");
            if(y == 0) {
                System.out.println("Der Dvisor darf nicht 0 sein!");
            }
        }

        this.erg = x%y;

        return this.erg;
    }

    //Berechnet die Summe
    public int sum() {
        int start = eingabe("Bitte geben Sie die anfangs Zahl ein: ");

        int end = eingabe("Bitte geben Sie die end Zahl ein: ");
        

        for(int i=start; i<end; i++) {
            this.erg+=i;
        }

        return this.erg;
    }

    //Berechnet die Quersumme
    public int quer() {

        int x = eingabe("Bitte geben Sie die Zahl ein: ");

        this.erg = 0;

		while (0 != x) {
			// addiere die letzte ziffer der uebergebenen zahl zur summe
			this.erg = this.erg + (x % 10);
			// entferne die letzte ziffer der uebergebenen zahl
			x = x / 10;
		}

        return this.erg;
    }

    //Liest die eingabe ein und erkennt "erg"
    //Giebt dann wenteder Zahl oder erg zurück
    private int eingabe(String text) {

        while(true) {
            System.out.println(text);
            String x = sc.nextLine();
        
            if(x.equalsIgnoreCase("erg")) {
                return this.erg;
            }  else {
                try {
                    return Integer.parseInt(x);
                } catch (Exception e) {
                    System.out.println("Keine gültige Zahl, bitte nochmal");
                }
            }
        }

    }

    //Getter und Setter

    public int getErg() {
        return erg;
    }

    public void setErg(int erg) {
        this.erg = erg;
    }

}
