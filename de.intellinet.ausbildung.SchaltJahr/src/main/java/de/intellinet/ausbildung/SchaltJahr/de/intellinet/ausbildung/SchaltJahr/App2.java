/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.SchaltJahr.de.intellinet.ausbildung.SchaltJahr;

import java.time.LocalDate;
import java.time.Period;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 11.12.2019
 */
public class App2 {

    long schalttage, schaltmonate, schaltJahre;
    String ergebnis = "";

    public String extracted(LocalDate startdatum, LocalDate enddatum) {

        schaltJahre = Period.between(startdatum, enddatum).getYears();
        schaltmonate = Period.between(startdatum, enddatum).getMonths();
        schalttage = Period.between(startdatum, enddatum).getDays();

        pruefen(startdatum, enddatum);

        return ergebnis;
    }

    public void pruefen(LocalDate startdatum, LocalDate enddatum) {
        if (schaltJahre == 0 && schaltmonate == 0 && schalttage == 0) {
            System.out.println("Cannot compare same date!");
        } else if (!Period.between(startdatum, enddatum).isNegative()) {
            if (schaltJahre == 1) {
                ergebnis += schaltJahre + " Jahr  ";
            } else if (schaltJahre > 1) {
                ergebnis += schaltJahre + " Jahre  ";
            }
            if (schaltmonate == 1) {
                if (schaltJahre > 0 && schalttage > 0) {
                    ergebnis += ", " + schaltmonate + " Monat  ";
                } else if (schaltJahre > 0 && schalttage == 0) {
                    ergebnis += "und " + schaltmonate + " Monat  ";
                } else {
                    ergebnis += schaltmonate + " Monat  ";
                }
            }
            if (schaltmonate > 1) {
                if (schaltJahre > 0 && schalttage > 0) {
                    ergebnis += ", " + schaltmonate + " Monate ";
                } else if (schaltJahre > 0 && schalttage == 0) {
                    ergebnis += "und " + schaltmonate + " Monate ";
                } else {
                    ergebnis += schaltmonate + " Monate ";
                }
            }
            if (schalttage == 1) {
                if (schaltJahre == 0 && schaltmonate == 0) {
                    ergebnis += schalttage + " Tag";
                } else {
                    ergebnis += "und " + schalttage + " Tag";
                }
            }
            if (schalttage > 1) {
                if (schaltJahre == 0 && schaltmonate == 0) {
                    ergebnis += schalttage + " Tage";
                } else {
                    ergebnis += "und " + schalttage + " Tage";
                }
            }
            System.out.println(ergebnis);
        } else {
            System.out.println("Logic order of Dates is wrong!");
        }
    }

}
