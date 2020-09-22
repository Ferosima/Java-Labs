package Lab_2.Vector;

import java.lang.reflect.Array;

public class Vector {
    private double a, b, c;

    public Vector(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getVectorModule() {
        double vectorModule = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)), 0.5);
        return vectorModule;
    }

    public Vector multiplyVector(double i) {
        return new Vector(a * i, b * i, c * i);
    }

    public Vector sumVectors(Vector vector) {
        return new Vector(vector.getA() + a, vector.getB() + b, vector.getC() + c);
    }

    public double scalarProductOfVectors(Vector vector) {
        return a * vector.getA() + b * vector.getB() + c * vector.getC();
    }

    public Vector vectorProductOfVectors(Vector vector) {
        double newA = b * vector.getC() - c * vector.getB();
        double newB = c * vector.getA() - a * vector.getC();
        double newC = a * vector.getB() - b * vector.getA();
        return new Vector(newA, newB, newC);
    }

    public String getAllParametrsToString() {
        String strA = Double.toString(a);
        String strB = Double.toString(b);
        String strC = Double.toString(c);
        return strA + " " + strB + " " + strC;
    }
}
