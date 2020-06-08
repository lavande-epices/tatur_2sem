public class Drawing_test {
    public static void main(String[] args) {
        Drawing s1 = new Drawing(15, 12, '.'); // b - столбец, a - строка.
        s1.print();
        s1.setPoint(3,4,'e'); //m - , r - ,
        s1.drawRectangle(1,3,6,6); //
        s1.Circle(5,6,4); // столбец; строка
    }
}
