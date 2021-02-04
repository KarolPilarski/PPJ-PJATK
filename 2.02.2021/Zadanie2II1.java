import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie2II1 {
    public static void main(String[] args) {
        String str="2020-02-02";
        Pattern p = Pattern.compile("\\d{4}[-]\\d{1,2}[-]\\d{1,2}");
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
    }
}
