import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtraSpaces {
    private static String n = "A a d D f , F K k 4 , 0";
    public static void main(String[] args) {
        String a = " ,";
        String b = ",";
        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(n);
        n = m.replaceAll(b);
        System.out.println(n);
    }
}
