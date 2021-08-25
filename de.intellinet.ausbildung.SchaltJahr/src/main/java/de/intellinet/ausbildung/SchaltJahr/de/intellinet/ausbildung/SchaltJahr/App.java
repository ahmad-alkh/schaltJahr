
package de.intellinet.ausbildung.SchaltJahr.de.intellinet.ausbildung.SchaltJahr;

/**
 * ahmalk
 *
 */
public class App {

    public int holeDatum(int jahr, int monat, int tag) {

        if (pruefenSchaltJahr(jahr) == true) {

            System.out.println("Ja es ist ein Schalt Jahr \t" + jahr + "/" + monat + "/" + tag);
        } else {
            System.out.println("Nein Es ist kein Schalt Jahr \t" + jahr + "/" + monat + "/" + tag);
        }
        return jahr;
    }

    boolean pruefenSchaltJahr(int jahr) {
        if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
            return true;
        }
        return false;
    }

    long betweenDay(int j, int m, int t) {
        int schaltJahre = 0, jahre = 0, ergebnis = 0, tageImMonate, monate_30 = 0, monate_31 = 0;

        for (int i = j; i < 2019; i++) {
            if (pruefenSchaltJahr(i) == true) {
                schaltJahre++;
            } else {
                jahre++;
            }

        }
        for (int i = m - 1; i >= 1; i--) {
            // m -= 1;
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                monate_30++;
            } else {
                monate_31++;
            }

        }
        int februar_28 = 0;
        int g = schaltJahre * 366 + jahre * 365 + t;
        schaltJahre *= 2;

        // jahre *= 1;

        if (m >= 3) {
            monate_31 -= 1;
            if (pruefenSchaltJahr(j) != true) {
                februar_28 = 28;
            } else {
                februar_28 = 29;
            }
        }

        monate_30 *= 30;
        monate_31 *= 31;
        tageImMonate = monate_30 + monate_31 + februar_28;
        ergebnis = tageImMonate + t + (7 * jahre) - jahre - schaltJahre;
        g += tageImMonate;
        while (ergebnis > 7) {

            ergebnis = ergebnis - 7;

        }

        System.out.println("Am " + j + "/" + m + "/" + t + " war ein " + tage(ergebnis));
        System.out.println("zwichen " + j + "/" + m + "/" + t + " und 2019/ gebt es " + g + " Tage");
        return g;
    }

    String tage(int t) {
        String tage = " ";
        switch (t) {
            case 1:
                tage = "Dinstag";
                break;
            case 2:
                tage = "Mitwoch";
                break;
            case 3:
                tage = "Donnerstag";
                break;
            case 4:
                tage = "Freitag";
                break;
            case 5:
                tage = "Sammstag";
                break;
            case 6:
                tage = "Sonntag";
                break;
            case 7:
                tage = "Montag";
                break;

            default:
                tage = "es gibt nicht";
                break;
        }

        return tage;

    }
}
