/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.SchaltJahr.de.intellinet.ausbildung.SchaltJahr;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 05.12.2019
 */
public class AppTest2 {

    // @Test
    // public void test() {
    // App app = new App();
    // app.holeDatum(1404, 5, 6);
    // // app.holeDatum(s);
    // }

    @Test
    public void test_01() {
        App app = new App();
        // app.pruefenSchaltJahr(1900);
        assertEquals(app.pruefenSchaltJahr(1902), false);
        assertEquals(app.pruefenSchaltJahr(1903), false);
        assertEquals(app.pruefenSchaltJahr(1904), true);
        assertEquals(app.pruefenSchaltJahr(1945), false);
        assertEquals(app.pruefenSchaltJahr(2014), false);
        assertEquals(app.pruefenSchaltJahr(2000), true);
        assertEquals(app.pruefenSchaltJahr(1891), false);
        assertEquals(app.pruefenSchaltJahr(1964), true);
        assertEquals(app.pruefenSchaltJahr(2019), false);
        assertEquals(app.pruefenSchaltJahr(3495), false);
        assertEquals(app.pruefenSchaltJahr(1442), false);
        assertEquals(app.pruefenSchaltJahr(1333), false);
        assertEquals(app.pruefenSchaltJahr(4356), true);
        assertEquals(app.pruefenSchaltJahr(1256), true);

    }

    @Test
    public void test_02() {
        App app = new App();
        // app.betweenDay(2018, 12, 1);
        app.betweenDay(1800, 6, 1);
        // app.holeDatum(s);
    }

    @Test
    public void test_03() {
        App2 app2 = new App2();
        app2.extracted(LocalDate.of(2019, 3, 2), LocalDate.of(2012, 12, 1));
        // System.out.println(app2.extracted());
        // System.out.println(app2.betweenDay(1800, 6, 1));

    }

    @Test
    public void test_04() {
        App3 app3 = new App3();

        System.out.println(app3.extracted(2010, 2013, 8, 4, 29, 25));
        // System.out.println(app2.betweenDay(1800, 6, 1));

    }

}
