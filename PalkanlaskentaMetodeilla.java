import java.util.Scanner;

public class PalkanlaskentaMetodeilla {
    public static void main(String[] args) {
        double tunnit, tuntipalkka, veroprosentti, verotonPalkka, veronOsuus;

        tunnit =  kysyTunnit();
        tuntipalkka = kysyTuntipalkka();
        veroprosentti = kysyVeroprosentti();
        
        verotonPalkka = laskeVerotonPalkka(tunnit, tuntipalkka);

        veronOsuus = verotonPalkka * veroprosentti /100;

        System.out.println("\nPalkka ilman veroja: " + verotonPalkka);
        System.out.println("Veron osuus palkasta: " + veronOsuus);
        System.out.println("Palkka verojen jälkeen: " + (verotonPalkka-veronOsuus));	
    }

    public static double kysyTunnit() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna tehtyjen työtuntien määrä: ");
        double tunnit = lukija.nextDouble();
        return tunnit;
    }

    public static double kysyTuntipalkka() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna tuntipalkka: ");
        double tuntipalkka = lukija.nextDouble();
        return tuntipalkka;
    }

    public static double kysyVeroprosentti() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna veroprosentti: ");
        double veroprosentti = lukija.nextDouble();
        return veroprosentti;
    }

    public static double laskeVerotonPalkka(double tunnit, double tuntipalkka) {
        return tunnit * tuntipalkka;
    }

}