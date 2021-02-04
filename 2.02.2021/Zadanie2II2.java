import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie2II2 {
    public static void main(String[] args) {
        System.out.println("Podaj email:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        Pattern p = Pattern.compile(".+[@].+[.].+");
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
    }
}

