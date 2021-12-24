import java.util.Scanner;

public class RechnerInterface {
    

    //Klasse damit man den eigentlichen Rechner auch einfach im normalen
    //Programmablauf haben könnte ohne dass der Benutzer eingaben tätigen muss

    Rechner rechner = new Rechner();
    Scanner sc = new Scanner(System.in);
    boolean weiter = true;  //Ob das Programm eine erneute abfrage machen soll, oder beendet werden soll

    public int rechnen() {

        wilkommensnachricht();

        //Hauptschleife
        while(weiter) {


            System.out.println("[+], [-] , [*], [/], [mod], [sum], [quer], [erg], [end]");
            

            System.out.println("Eingabe:");

            //Erkennt die eingabe des Benutzer und ruft dann die passende Methode in Rechner auf
            switch(sc.nextLine().toLowerCase()) {
                case "+": 
                    ergebniss(rechner.plus()); 
                    break;
                case "-": 
                    ergebniss(rechner.minus()); 
                    break;
                case "*": 
                    ergebniss(rechner.multiplikation()); 
                    break;
                case "/": 
                    ergebniss(rechner.division()); 
                    break;
                case "mod": 
                    ergebniss(rechner.mod()); 
                    break;
                case "sum": 
                    ergebniss(rechner.sum()); 
                    break;
                case "quer": 
                    ergebniss(rechner.quer()); 
                    break;
                case "erg": 
                    System.out.println("Das letze Ergebnuss war:  " + rechner.getErg());
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

        //Returnt das Letze Ergebiss, sollte mit ihm weiterem Programmverlauf weitergerenet werden wollen
        return rechner.getErg();
    }

        //Gibt dass Ergebniss aus
        private void ergebniss(int erg) {
            System.out.println("Ergebniss: " + erg);
        }

    //Gibt eine Wilkommensnachricht bei Programmstart aus
    private void wilkommensnachricht() {
        System.out.println("Hallo leiber Benutzer");
        System.out.println("Bitte wählen Sie eine Rechenoperation aus: ");
        System.out.println("[\"+\"]");
        System.out.println("[\"-\"]");
        System.out.println("[\"*\"]");
        System.out.println("[\"/\"]");
        System.out.println("[\"mod\"] für Restwert (Modulo) bei einer Division");
        System.out.println("[\"sum\"] für Summe aller Zahlen von einer Startzahl bis zu einer Endzahl");
        System.out.println("[\"quer\"] für die Quersumme der eingegeben Zahl");
        System.out.println("[\"erg\"] um das letzte ergebniss zu erhalten");
        System.out.println("[\"end\"] um das Programm zu beenden");
        System.out.println("Bitte geben Sie nur Integer ein oder \"erg\" um das letze ergebniss weiter zu verwenden");
    }

}
