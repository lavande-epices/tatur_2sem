import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String email = "java@gmail.com";
        String[] p1 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] p2 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "_", "-", "."};
        email = email.toLowerCase();
        Pattern p = Pattern.compile(".+@+" + ".+[a-z,а-я]+"+ ".+\\.[a-z,а-я]+$");
        Matcher m = p.matcher(email);
        if (m.matches()) {
            System.out.print("yes");
        }
        else System.out.print("no");

    }
}