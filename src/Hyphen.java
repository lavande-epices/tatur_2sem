import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hyphen {
private static String n = "синий - это не голубой. Но на юго-восточных островах думают иначе, а как в северо-западной округе?";
   public static void main(String[] args) {
       String z = "-";
       String v = "- -"; //синий! !это не голубой. Но на юго- -восточных островах думают иначе, а как в северо- -западной округе?
       Pattern pp = Pattern.compile(z);
       Matcher mm = pp.matcher(n);
       n = mm.replaceAll(v);
       n = n.replaceAll("\\s? - ? \\s", "! !");
       String delimiter = " ";
       String str[] = n.split(delimiter);
       char[] mas = n.toCharArray();
       int s = 0;
       for (int i = 1; i < mas.length - 1; i++){

           if(mas[i] == ' '){
               s++; //указывается номер последнего пробела => s - это номер нашего слова
           }
           if (mas[i] == '-'&& mas[i-1]==' '){
               int j = i;
               while (mas[j] != ' '){
                   j--;
               }
               int x = i + 1 ;
               while (mas[x] != ' '){
                   x++;
               }
           }
           if (mas[i] == '-'&& mas[i+1]==' '){
               String k = str[s];
               str[s] = str[s-1];
               str[s-1] = k;
           }
       }
       System.out.print(mas);
   }
}
