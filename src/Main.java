public class Main {

    private static double fungsi(double val, String question) {
        double result = 0;
        double val1;
        double val2;
        switch (question){
            case "6.13":
                val1 = Math.pow(Math.E, 0.5 * val);
                val2 = 5 - (5 * val);
                result =  Math.abs(val1 - val2);
                break;

            case "6.19":
                double V = 30;
                double R = 3;
                val1 = Math.PI * Math.pow(val, 2);
                val2 = ((3 * R) - val) / 3;
                result = Math.abs(V - (val1 * val2));
                break;

            case "6.20":
                double S = 0.0002;
                double B = 20;
                double n = 0.03;
                double Q = 5;

                val1 = Math.sqrt(S) * Math.pow(B * val, 5/3);
                val2 = n * Math.pow((B + (val*2)), 2/3);
                result = Math.abs(Q - (val1 / val2));
                break;

        }

        return result;
    }

    private static double calculateRelativeError(double val1, double val2){
        return Math.abs(val1 - val2) / val2;
    }

    private static double newtonRhapson(double initValue, String question){
        double h = 0.00000000001;
        double xi = initValue;
        double errorTolerance = 0.02;
        double relativeError = 0;

        do {
            double val1 = fungsi(xi, question) * h;
            double val2 = fungsi(xi + h, question) - fungsi(xi, question);
            double xn = xi - (val1 / val2);
            relativeError = calculateRelativeError(xi, xn);
            xi = xn;
        }while (relativeError >= errorTolerance);

        return xi;
    }

    public static void main(String[] args) {
        System.out.println(newtonRhapson(10, "6.20"));
    }
}
