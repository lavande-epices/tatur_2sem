import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cat {
    private static String n = "КоТ коот Кошка КашА кот и коТ";
    public static void main(String[] args) {
        n = n.toLowerCase();
        int i = 0;
        Pattern pattern = Pattern.compile("кот");
        Matcher matcher = pattern.matcher(n);
        while(matcher.find()){
            i++;
        }
        System.out.print(i);
    }
}
