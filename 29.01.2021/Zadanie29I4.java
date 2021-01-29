import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie29I4 {
    public static void main(String[] args) {

        String tekst="Jan III Sobieski herbu Janina (ur. 17 sierpnia 1629 w Olesku, zm. 17 czerwca 1696 w Wilanowie) - król Polski iwielki książę litewski od 1674, hetman wielki koronny od 1668, hetman polnykoronny od 1666, marszałek wielki koronny od 1665, chorąży wielki koronnyod 1656.";

        String[] slowa = tekst.split("[- ,.()]");
        System.out.println("Iosc slow: "+slowa.length);

        int j=0;
        Pattern p = Pattern.compile("\\d{2}.+\\d{4}");
        for(int i=0;i<slowa.length-2;i++){
            Matcher m = p.matcher(slowa[i]+slowa[i+1]+slowa[i+2]);
            if(m.matches()){
                j++;
            }
        }
        System.out.println("Iosc dat: "+j);


        j=0;
        p = Pattern.compile("\\d{4}");
        for(int i=0;i<slowa.length;i++){
            Matcher m = p.matcher(slowa[i]);
            if(m.matches()){
                j++;
            }
        }
        System.out.println("Iosc dat(rok): "+j);


        j=0;
        p = Pattern.compile("[A-Z].+");
        for(int i=0;i<slowa.length;i++){
            Matcher m = p.matcher(slowa[i]);
            if(m.matches()){
                j++;
            }
        }
        System.out.println("Iosc slow zaczynajacych sie wielka litera: "+j);


        String[] slowaiKropki = tekst.split("[- ,()]");
        j=0;
        p = Pattern.compile(".+[.]");
        for(int i=0;i<slowaiKropki.length;i++){
            Matcher m = p.matcher(slowaiKropki[i]);
            if(m.matches()){
                j++;
            }
        }
        System.out.println("Ilosc kropek: "+j);


    }
}
