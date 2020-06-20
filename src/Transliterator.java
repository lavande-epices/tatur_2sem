public class Transliterator {
    char[] r;
    String[] e;
        public Transliterator(char[] r, String[] e) {
            this.r = r;
            this.e = e;

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
