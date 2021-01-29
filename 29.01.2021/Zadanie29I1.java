import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie29I1 {
    public static void main(String[] args) {
        String str="abbcah";
        Pattern p = Pattern.compile("[abch]{4,9}");
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
    }
}
