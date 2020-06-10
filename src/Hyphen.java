public class Hyphen {
private static String n = "синий - это не голубой. Но на юго-восточных островах думают иначе, а как в северо-западной округе?";
   public static void main(String[] args) {
       System.out.println(n);
       n = n.replaceAll("([a-z,а-я]+)-([a-z,а-я]+)", "$2-$1");
       System.out.println(n);
   }
}
