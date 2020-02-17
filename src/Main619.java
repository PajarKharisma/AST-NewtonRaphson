public class Main619 {

    public static void main(String[] args) {

        double result = 1;
        double bb = 0;
        double ba = 100;
        double v = 30;
        double tolerance = 0.0000000000001;
        while (Math.abs(result - v) > tolerance) {
            double h = (bb + ba) / 2;
            double val1 = Math.PI * Math.pow(h,2);
            double val2 = (9 - h) / 3;
            result = val1 * val2;
            if(result < v) {
                ba = h;
            } else {
                bb = h;
            }
            System.out.println(h);
        }
    }
}
