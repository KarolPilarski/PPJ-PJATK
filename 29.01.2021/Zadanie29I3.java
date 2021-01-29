import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie29I3 {
    public static void main(String[] args) {
        String str="10110101";
        Pattern p = Pattern.compile("[1][01]+");
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
    }
}
