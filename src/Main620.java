public class Main620 {
    public static void main(String[] args) {
        double result = 1;
        double bb = 0;
        double ba = 100;
        double Q = 5;
        double S = 0.0002;
        double B = 20;
        double n = 0.03;
        double tolerance = 0.0000000000001;

        while (Math.abs(result - Q) > tolerance) {
            double H = (bb + ba) / 2;
            double val1 = Math.sqrt(S) * Math.pow(B * H, 5/3);
            double val2 = n * Math.pow((B + (H*2)), 2/3);
            result = val1 / val2;
            if(result < Q) {
                bb = H;
            } else {
                ba = H;
            }
            System.out.println(H);
        }
    }
}
