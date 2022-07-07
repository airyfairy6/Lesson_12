public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = a;
        this.b = b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public  double geroneSquare (double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid value");
            return -1;
        } else {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

    }

    }

