import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String email = "java@gmail.com";
        email = email.toLowerCase();
        Pattern p = Pattern.compile(".+@+" + ".+[a-z,а-я]+"+ ".+\\.[a-z,а-я]+$");
        Matcher m = p.matcher(email);
        if (m.matches()) {
            System.out.print("yes");
        }
        else System.out.print("no");

    }
}