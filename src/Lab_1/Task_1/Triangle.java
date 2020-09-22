package Lab_1.Task_1;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        setHypotenuse();
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void setHypotenuse() {
        this.c = Math.pow((Math.pow(this.a, 2) + Math.pow(this.b, 2)), 0.5);
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public double getSquare() {
        return (this.a * this.b) / 2;
    }
}
