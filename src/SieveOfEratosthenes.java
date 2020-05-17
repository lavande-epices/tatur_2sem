import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Second(n);
    }
    public static boolean First(int n) {
        boolean mas[] = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++)
            if (i < 2)
                mas[i] = false;
            else mas[i] = true;
        for (int i = 2; i < mas.length; i++) {
            if (mas[i]) {
                for (int k = 2; k * i < mas.length; k++) {
                    mas[i * k] = false;
                }
            }
        }
        return false;
    }
        public static int[] Second(int n) {
            boolean mas[] = new boolean[n + 1];
            for(int i = 1; i < n; i++) {
            mas[i] = First(i);
            }
            int p = 0;
            for (int i = 1; i < n; i++) {
                if (mas[i]) {
                    p ++;
                }
            }
            int s[] = new int[p+1];
            for (int i = 1; i < p; i++) {
                if (mas[i]) {
                    for (int l = 1; l < p; l++) {
                        s[l] = i;
                    }
                }
            }
            for (int i = 0; i < p; i++) {
                System.out.println(s[i]);
            }
            return s;
        }
}