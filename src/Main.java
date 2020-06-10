public class Main {
    int a;
    int b;
    char l;
    Main(int a, int b, char l) {
        this.a = a;
        this.b = b;
        this.l = l;
    }
    char[][] print() {
        char[][] c = new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                c[i][j] = l;
            }
        }
        return c;
    }

    void setPoint(int m, int r, char p){
        char[][] c = new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if( i == m && j == r){
                    c[i][j] = p;
                }
                else c[i][j] = l;
            }
        }
    }
    int q1; //столбец
    int q2; //начало
    int q3; //конец
    void drawVerticalLine(int y, int x1, int x2, char [][]c){ //q1 - столбец, q2 - начало, q3 - конец
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if( i > x1 && i < x2 && j == y){
                    c[i][j] = '|';
                }
            }
        }
    }
    void drawHorizontalLine(int q1, int q2, int q3, char [][]c){ //q1 - строка, q2 - начало, q3 - конец
        for (int i = 0; i < this.a; i++) {
            for (int j = 0; j < this.b; j++) {
                if( j > q2 && j < q3 && i == q1){
                    c[i][j] = '_';
                }
            }
        }
    }

}
