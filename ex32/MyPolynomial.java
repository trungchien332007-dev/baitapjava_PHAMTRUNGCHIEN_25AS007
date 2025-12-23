package ex32;

public class MyPolynomial {
    private double[] coeffs;


    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }


    public int getDegree() {
        return coeffs.length - 1;
    }


    public double evaluate(double x) {
        double result = 0;
        for (int i = getDegree(); i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }


    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double a = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double b = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            newCoeffs[i] = a + b;
        }
        return new MyPolynomial(newCoeffs);
    }


    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs =
                new double[this.getDegree() + right.getDegree() + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] == 0) continue;

            if (sb.length() > 0 && coeffs[i] > 0) {
                sb.append(" + ");
            } else if (coeffs[i] < 0) {
                sb.append(" - ");
            }

            double absCoeff = Math.abs(coeffs[i]);

            if (i == 0) {
                sb.append(absCoeff);
            } else if (i == 1) {
                sb.append(absCoeff).append("x");
            } else {
                sb.append(absCoeff).append("x^").append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}

