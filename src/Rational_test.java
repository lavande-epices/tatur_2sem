public class Rational_test {
    public static void main(String[] args) {
 //       NoRational(20);
        Rational n1 = new Rational(5, 8);
        Rational n2 = new Rational(1,12);
        System.out.println(Rational.ZERO);
        System.out.println(n1.sum(n1));
    }
/*
    private static double NoRational(int n) {
        double s = 0;
        s = Check(n, s);
        System.out.println(s);
        return s;
    }
    public static double Check(int l, double s) {
        Rational n1 = new Rational(l);
        if (l == 0) {
            return s;
        } else {
            double w = n1.toDouble(1, l);
            l--;
            s = s + w;
            return Check(l, s);
        }
    }
*/
}
