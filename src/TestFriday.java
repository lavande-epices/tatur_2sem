public class TestFriday {
    public static void main(String[] args) {
        char[] rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] eng = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        //Создаем транслитератор на основе двух массивов одинаковой длины.

//Символы первого массива должны превращаться в соответствующие

//цепочки символов второго массива.

        Transliterator t = new Transliterator(rus, eng);

//функция tranlateOneSymbol ищет в первом массиве данный ей символ,

//и выводит цепочку символов из второго массива

        System.out.println(t.translateOneSymbol('я')); // ia

//Если символа нет в массиве, то нужно вернуть то, что было раньше

        System.out.println(t.translateOneSymbol('$')); // $

//Функция translate заменяет все символы строки

        System.out.println(t.translate("экзамен")); // ekzamen
        System.out.println(t.translate("моё имя")); // ilia

        char [] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] texts = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        Transliterator n = new Transliterator(nums, texts);
        System.out.println(n.translateOneSymbol('$'));
        System.out.println(n.translateOneSymbol('1'));
        System.out.println(n.translate("123"));

        System.out.println(t.translateOneSymbol('Р')); // R

        System.out.println(t.translateOneSymbol('Я')); // Ia

        System.out.println(t.translateOneSymbol('Ь')); //

        System.out.println(t.translate("Моё имя")); // Ilia

        System.out.println(t.translate("Яблоко")); // Iabloko

        System.out.println(t.translate("ПАРАШЮТ")); // PARAShIuT
    }

}