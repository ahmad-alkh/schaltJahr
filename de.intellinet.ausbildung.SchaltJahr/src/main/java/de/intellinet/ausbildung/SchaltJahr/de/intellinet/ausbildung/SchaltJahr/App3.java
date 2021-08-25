/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.SchaltJahr.de.intellinet.ausbildung.SchaltJahr;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 11.12.2019
 */
public class App3 {

    long schalttage, schaltmonate, schaltJahre;
    String ergebnis = "";

    public String extracted(int jahr, int jahr2, int monat, int monat2, int tag, int tag2) {
        int betweenDay, betweenYers = 0, betweenMonth;

        betweenDay = berchnen(tag2, tag);
        betweenMonth = berchnen(monat, monat2);
        betweenYers = berchnenJahr(jahr, jahr2);

        ergebnis += betweenDay + " monat " + betweenMonth + " jahr " + betweenYers;
        return ergebnis;
    }

    int d;

    private int berchnen(int a, int b) {
        if (a > b) {
            d = a - b;
        } else {
            d = b - a;
        }
        return d;
    }

    private int berchnenJahr(int a, int b) {
        if (a > b) {
            d = a - b;
        } else {
            System.out.println("nicht");
            return 0;
        }
        return d;
    }

}
