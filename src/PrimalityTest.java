import java.util.Scanner;
public class PrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        NaturalNumber(n);
    }


    private static boolean NaturalNumber(int n) {
        if (n > 1) {
            int k = (int) Math.cbrt(n);
            for (int i = 1; i < k; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
        return false;
    }
}

