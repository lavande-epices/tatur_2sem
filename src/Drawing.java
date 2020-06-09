public class Drawing {
    int a;
    int b;
    char l;
     Drawing(int a, int b, char l) {
         this.a = a;
         this.b = b;
         this.l = l;
     }
     void print() {
         char[][] c = new char[a][b];
         for (int i = 0; i < a; i++) {
             for (int j = 0; j < b; j++) {
                 c[i][j] = l;
             }
         }
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
    void drawVerticalLine(int q1, int q2, int q3, char [][]c){ //q1 - столбец, q2 - начало, q3 - конец
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if( i > q2 && i < q3 && j == q1){
                    c[i][j] = '|';
                }
            }
        }
    }
    void drawHorizontalLine(int q1, int q2, int q3, char [][]c){ //q1 - строка, q2 - начало, q3 - конец
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if( j > q2 && j < q3 && i == q1){
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
            int min_v;
            int min_h;
            int max_h;
            int max_v;
        if (q1 < e1){
            min_h = q1;
            max_h = e1;
        } else {
            min_h = e1;
            max_h = q1;
        }
        if (q2 < e2){
            min_v = q2;
            max_v = e2;
        } else {
            min_v = e2;
            max_v = q2;
        }
        for (int i = 0; i < a; i++) {
          for (int j = 0; j < b; j++) {
             if ( (j == q1 && i == q2) || (j == e1 && i == e2) ){
               c[i][j] = l;
              }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
    }
    void Circle(int t1, int t2, int radius){
        // a - столбец, b - строка.
        // идея: если точка не лежит в t1 столбце/ t2 строке, то проверяем по циклу, который строит прямоугольный треуг. с гип-й = radius
        int k;
        int lw;
        if (t1 - radius <= 0){
            k = 0;
        }
        else {
            k = t1 - radius; //левая точка
        }
        if (t2 - radius <= 0){
            lw = 0;
        }
        else {
            lw = t2 - radius; //верхняя точка
        }
        //это четыре точки, с которыми мы будем строить треугольники.
        char[][] c = new char[a][b];
        for (int i = 0; i < a; i++) { //строка
            for (int j = 0; j < b; j++) { //столбец
                if(i < lw ||  j < k) {
                    c[i][j] = l;
                }
                if(i >= lw && j >= k ) {
                    c[i][j] = '!';
                }
                if (i == t1 && j == t2){
                    c[i][j] = 'w';
                }
            }
        }
        System.out.print("--------тест на круг--------");
        System.out.print('\n');
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
