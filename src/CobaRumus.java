public class CobaRumus {

    public static void main(String[] args) {
        //6.19
        /*double V = 30;
        double R = 3;
        double h = 8.613906656214107;

        double val1 = Math.PI * Math.pow(h, 2);
        double val2 = ((3 * R) - h) / 3;
        double result = val1 * val2;
        System.out.println(result);*/

        //6.20
        double S = 0.0002;
        double B = 20;
        double n = 0.03;
        double H = 0.5303300850895643;

        double val1 = Math.sqrt(S) * Math.pow(B * H, 5/3);
        double val2 = n * Math.pow((B + (H*2)), 2/3);
        double Q = val1 / val2;
        System.out.println(Q);

        //6.13
        /*double e = Math.E;
        double x = 0.7141749679505337;

        double val1 = Math.pow(e, 0.5 * x);
        double val2 = 5 - (5 * x);
        System.out.println("val 1 : " + val1);
        System.out.println("val 2 : " + val2);*/
    }
}
