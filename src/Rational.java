public class Rational {
    private int n;
    private int d;
    Rational(int n, int d){
        this.n = n;
        this.d = d;
        int k = Euclidean_al(this.n, this.d);
        n = n / k;
        if (d >= Rational.ZERO)
            d = d / k;
    }
 /*   Rational(int n){
        this.n = n;
    }
    public String toString(int n, int d){
        if ( n== 0 && d != 0){
            System.out.println("0");
            return "0";
        }
        if (d == 1){
            System.out.println(this.n + "/");
            return String.valueOf(this.n);
        }
        if (d == 0){
            System.out.println("infinity");
            return "infinity";
        }
        System.out.println(this.n + "/" + this.d);
        return this.n + "/" + this.d;
    }*/
 static double toDouble(int n, int d){
        double m = (double) n /(double) d;
        return m;
    }

    public int getN() {
        return n;
    }
    public int getD() {
        return d;
    }
    public static final int ONE = 1;
    public static final int ZERO = 0;

    private static int Euclidean_al(int n, int d){
        int a = n;
        int b = d;
        if (b == Rational.ZERO){
            return a;
        }
        return Euclidean_al(b, a%b);
    }
    static Rational sum(Rational r){
        int d1 = r.getD();
        int n1 = r.getN() + d1;
        System.out.println(toDouble(n1, d1));
        return new Rational(n1, d1);
    }
    static Rational sub(Rational r){
        int d1 = r.getD();
        int n1 = r.getN() - d1;
        System.out.println(toDouble(n1, d1));
        return new Rational(n1, d1);
    }
    static Rational add(Rational r1, Rational r2) {
        int n1 = r1.getN();
        int n2 = r2.getN();
        int d1 = r1.getD();
        int d2 = r2.getD();
        int euc = Euclidean_al(d1, d2);
        n1 = n1 * d2 / euc;
        n2 = n2 * d1 / euc;
        int d3 = d2 * d1 / euc;
        int n3 = n1 + n2;
        System.out.println(toDouble(n3, d3));
        return new Rational(n3, d3);
    }
    static int div(Rational r1, Rational r2) {
        int n1 = r1.getN();
        int n2 = r2.getN();
        int d1 = r1.getD();
        int d2 = r2.getD();
        int euc = Euclidean_al(d1, d2);
        n1 = n1 * d2 / euc;
        n2 = n2 * d1 / euc;
        int t = 0;
        while (n1 > n2){
            t++;
            n1 = n1 - n2;
        }
        return t;
    }
}