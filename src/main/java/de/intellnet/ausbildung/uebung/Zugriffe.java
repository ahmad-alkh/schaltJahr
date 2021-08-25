/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellnet.ausbildung.uebung;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 11.09.2019
 */
public class Zugriffe {

    int a;
    private int b;
    public int c;

    public Integer c1;
    public static int c2;
    private static int c3;

    protected double d;

    protected void hij() {
        System.out.println("hij: " + b);
    }

    private void methode() {
        System.out.println("hallo" + c);
    }

    public void abc() {
        c3 += 17;

    }

    void abcPackagePrivate() {
        int x = 8;
    }

    protected int def() {
        System.out.println("def" + a);
        return c3;

    }

}
