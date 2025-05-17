public class Polynomial {
    double[] coeff;

    public Polynomial() {
        this.coeff = new double[1];
        coeff[0] = 0;
    }

    public Polynomial(double[] coeff) {
        this.coeff = new double[coeff.length];
        for (int i = 0; i < coeff.length; i++) {
            this.coeff[i] = coeff[i];
        }
    }

    public Polynomial add(Polynomial poly) {
        Polynomial longer_poly = (this.coeff.length > poly.coeff.length) ? this : poly;
        Polynomial other_poly = (longer_poly == this) ? poly : this;

        for (int i = 0; i < other_poly.coeff.length; i++) {
            longer_poly.coeff[i] = longer_poly.coeff[i] + other_poly.coeff[i];
        }

        return longer_poly;
    }

    public double evaluate(double x) {
        double result = 0;

        for (int i = 0; i < this.coeff.length; i++) {
            result += this.coeff[i] * Math.pow(x, i);
        }

        return result;
    }


    public boolean hasRoot(double x) {
        return evaluate(x) == 0;
    }
}
