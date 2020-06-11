public class Drawing {
    int a;
    int b;
    char l;
     Drawing(int a, int b, char l) {
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
    void drawHorizontalLine(int y, int x1, int x2, char [][]c){ //q1 - строка, q2 - начало, q3 - конец
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if( j > x1 && j < x2 && i == y){
                    c[i][j] = '_';
                }
            }
        }
    }
    // q1 - столбец 1 точки
    // q2 - строка 1 точки
    // e1 - столбец 2 точки
    // e2 - столбец 2 точки
    void drawRectangle(int q1, int q2, int e1, int e2) {
        System.out.print("------Прямоугольник------" + '\n');
        System.out.print('\n');
        char[][] c = new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                c[i][j] = l;
            }
        }
            drawHorizontalLine(q1, 0, b, c);
            drawVerticalLine(q2, 0, b, c);
            drawVerticalLine(e2, 0, a, c);
            drawHorizontalLine(e1, 0, a, c);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
    }
    void Circle(int x, int y, int radius){
        // a - столбец, b - строка.
        // идея: если точка не лежит в t1 столбце/ t2 строке, то проверяем по циклу, который строит прямоугольный треуг. с гип-й = radius

    }
}
