public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(String nom, double a, double b, double c) {
        super(nom);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculerPerimetre() {
        return a + b + c;
    }

    @Override
    public double calculerAire() {
        double s = calculerPerimetre() / 2.0;
        double delta = s * (s - a) * (s - b) * (s - c);
        if (delta <= 0) return 0;
        return Math.sqrt(delta);
    }
}
