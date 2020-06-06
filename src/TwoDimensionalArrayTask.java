import java.util.Arrays;
public class TwoDimensionalArrayTask {
    public static void main(String[] args) {
        char[][] c = new char[20][20];
        First(c);
    }
        public static void First (char[][] c){
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {
                    c[i][j] = '.';
                }
            }
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {
                    System.out.print(" " + c[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("============ Заполним строки: ==========");
            Arrays.fill(c[19], '#');
            Arrays.fill(c[0], '#');
                //fillFirstAndLastLines(c, '#');
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {
                    System.out.print(" " + c[i][j] + " ");
                }
                System.out.println();
            }
            Arrays.fill(c[19], '.');
            Arrays.fill(c[0], '.');
            System.out.println("============ Заполним столбцы: =========");
            //fillFirstAndLastColumns(c, '#');
            for (int i = 0; i < c.length; i++){
                c[i][0] = '#';
                c[i][19] = '#';
            }
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c.length; j++) {
                    System.out.print(" " + c[i][j] + " ");
                }
                System.out.println();
            }
// 1. `createTable(20, '.')` возвращает массив char 20 на 20, все символы в массиве должны быть '.'
// 1. `printTable` печатает массив на экран. При этом выводите символы подряд, без запятых. Можете вывести пробелы между символами, так получается более красиво.
// 1. `fillFirstAndLastLines` Воспользуйтесь `Arrays.fill()`, чтобы заполнить первую и последнюю строки массива символами '#'.
// 1. `fillFirstAndLastColumns` Заполните первый и последний столбец массива символами '#'.

    }
    }

