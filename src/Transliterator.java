public class Transliterator {
    private char[] r;
    private String[] e;
    Transliterator (char[] r, String[] e){
        this.r = r;
        this.e = e;
    }
    static Transliterator createICAO_DOC_9303() {
        char[] r = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        String[] e = {"a", "b", "v", "g", "d", "e", "e", "zh", "z", "i", "i", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "kh", "ts", "ch", "sh", "shch", "ie", "y", "", "e", "iu", "ia"};
        return new Transliterator(r,e);
    }
        //Символы первого массива должны превращаться в соответствующие
        //цепочки символов второго массива.
    String translateOneSymbol(char symbol){
        String testing = String.valueOf(symbol).toLowerCase();
        for (int i = 0; i < r.length; i++) {
        if (r[i] == symbol)
            return e[i];
        else if (testing.charAt(0) == r[i]){
            String[] l = e[i].split("");
            return e[i].replaceAll(l[0], l[0].toUpperCase());
            }
        }
        return String.valueOf(symbol);
  }
    String translate(String word) {
        String[] letters = word.split("");
        char[] letter = word.toCharArray();
        for (int j = 0; j < letters.length; j++) {
            word = word.replaceAll(letters[j], translateOneSymbol(letter[j]));
        }
        return word;
    }
}
