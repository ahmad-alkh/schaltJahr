/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellnet.ausbildung.uebung;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 11.09.2019
 */
class ZugriffeTest {

    @Test
    void test() {
        Zugriffe z1 = new Zugriffe();
        Zugriffe z2 = new Zugriffe();

        z1.c = 5;

        assertEquals(5, z1.c);
        assertEquals(0, z2.c);

        Zugriffe.c2 = 2;

        assertEquals(2, z1.c2);
        assertEquals(2, z2.c2);

    }

}
