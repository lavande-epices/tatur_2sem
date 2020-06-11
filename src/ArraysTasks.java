import java.util.Scanner;
import java.util.Arrays;
public class ArraysTasks {
    public static void main(String [] args) {
        // Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        // First(n);

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Введите n: ");
        n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Введите массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите " + i + "-ый компонет массива a");
            a[i] = input.nextInt();
            //hasSimilar(a);
            //Average(a);
            sortReverse(a);

        }
    }

   /* public static int[] First(int n) {
        int mas[] = new int[n+1];
        for(int i = 1; i <= n; i++){
            mas[i] = 2*i;
        }
        for (int i = 0; i <= n; i++) {
            System.out.println(mas[i]);
        }
        return mas;
    }

        private static boolean hasSimilar ( int[] a){
            int len = a.length;
            Arrays.sort(a);
            int i = 0;
            while (i < len - 1) {
                if (a[i] == a[i + 1]) {
                    System.out.println('4');
                    return true;
                }
                i++;
            }
            System.out.println('2');
            return false;
        }

   public static int Average(int[] a) {
        int n = 0;
        for(int i = 0; i < a.length; i++){
            n = n + a[i];
        }
        System.out.println(n / a.length);
        return n / a.length;
    }*/
   private static int[] sortReverse(int[] a){
       int [] m =Arrays.copyOf(a, a.length);
       Arrays.sort(m);
       for(int i = 0; i < m.length; i++)
       System.out.println(m[i]);
       return m;
   }

}