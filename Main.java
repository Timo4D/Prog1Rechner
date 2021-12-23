import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean weiter = true;  //Ob das Programm eine erneute abfrage machen soll, oder beendet werden soll
        Scanner sc = new Scanner(System.in);
        Rechner rechner = new Rechner();

        wilkommensnachricht(); //Gibt eine Wilkommensnachricht bei Programmstart aus

        //Hauptschleife
        while(weiter) {


            System.out.println("+, - , *, /, mod, sum, quer, erg, end");
            

            System.out.println("Eingabe:");

            //Erkennt die eingabe des Benutzer und ruft dann die passende Methode in Rechner auf
            switch(sc.nextLine()) {
                case "+": 
                    rechner.plus();
                    break;
                case "-": 
                    rechner.minus();
                    break;
                case "*": 
                    rechner.multiplikation();
                    break;
                case "/": 
                    rechner.division();
                    break;
                case "mod": 
                    rechner.mod();
                    break;
                case "sum": 
                    rechner.sum();
                    break;
                case "quer": 
                    rechner.quer();
                    break;
                case "erg": 
                    rechner.getErg();
                    break;
                case "end": 
                    weiter = false;
                    break;
                default: 
                    System.out.println("Keine Gültige eingabe!");
            }

            //Frage ob weitergerechnet werden soll
            if(weiter) {
                System.out.println("Möchten Sie weiterrechnen?  y/n");
                if(sc.nextLine().equalsIgnoreCase("n")) {
                    weiter = false;
                }
            }
                
            System.out.println("----------------------------------------------------"); //Linie zur besseren Übersicht bei der benutzung


        }

        System.out.println("Danke dass Sie ein Produkt von uns verwendet haben");
        System.out.println("Wir würden uns über eine gute Note freuen!");

        sc.close();
        
    }

    //Gibt eine Wilkommensnachricht bei Programmstart aus
    public static void wilkommensnachricht() {
        System.out.println("Hallo leiber Benutzer");
        System.out.println("Bitte wählen Sie eine Rechenoperation aus: ");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("mod für Restwert (Modulo) bei einer Division");
        System.out.println("sum für Summe aller Zahlen von einer Startzahl bis zu einer Endzahl");
        System.out.println("quer für die Quersumme der eingegeben Zahl");
        System.out.println("erg um das letzte ergebniss zu erhalten");
        System.out.println("end um das Programm zu beenden");
        System.out.println("Bitte geben Sie nur Integer ein oder \"erg\" um das letze ergebniss weiter zu verwenden");
    }
}
