package org.osgeo.proj4j.util;

public final class Complex {
    public double r;
    public double i;
    public Complex(double r, double i) {
        this.r = r;
        this.i = i;
    }
    public Complex(Complex that) {
        this(that.r, that.i);
    }

    public int hashCode() {
        return Double.hashCode(r) | 37 * Double.hashCode(i);
    }

    public boolean equals(Object that) {
        if (that instanceof Complex)  {
            return ((Complex) that).r == r && ((Complex)that).i == i;
        } else {
            return false;
        }
    }
}
