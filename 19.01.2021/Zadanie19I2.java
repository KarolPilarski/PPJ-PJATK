public class Zadanie19I2 {
    public static void main(String[] args) {

    }
}

class Telefon{
    protected String InterfejsKomunikacyjny;
    protected String Kolor;
    Telefon(String InterfejsKomunikacyjny,String Kolor){
        this.InterfejsKomunikacyjny=InterfejsKomunikacyjny;
        this.Kolor=Kolor;
    }
     public void zadzwon(String numer){
        System.out.println(numer);
     }
     public void wyswietlHistoriePolaczen(){
        System.out.println("Brak historii");
     }
}

class Komorka extends Telefon{
    protected String[] numery = new String[10];
    Komorka(String InterfejsKomunikacyjny,String Kolor){
        super(InterfejsKomunikacyjny,Kolor);
    }
    public void zadzwon(String numer){
        System.out.println(numer);
        for(int i=8;i>0;i++){
            numery[i+1]=numery[i];
        }
        numery[0]=numer;
    }
    public void wyswietlHistoriePolaczen(){
        for(int i=0;i<10;i++){
            System.out.println((i+1)+". "+numery[i]);
        }
    }
}
class osoba{
    public String imie,nazwisko,numer;
    osoba(String imie,String nazwisko,String numer){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numer=numer;
    }
}

class Smartfon extends Komorka{
    protected osoba[] znajomi = new osoba[100];
    Smartfon(String InterfejsKomunikacyjny,String Kolor){
        super(InterfejsKomunikacyjny,Kolor);
    }
    public void zadzwon(String numer){
        System.out.println(numer);
        for(int i=8;i>0;i++){
            numery[i+1]=numery[i];
        }
        numery[0]=numer;
    }
    public void wyswietlHistoriePolaczen(){
        for(int i=0;i<10;i++){
            System.out.println((i+1)+". ");
            int nr=101;
            for(int j=0;j<100;j++){
                if(znajomi[j].numer==numery[i]) nr=j;
            }
            if(nr==101) System.out.println(numery[i]);
            else System.out.println(znajomi[nr].imie+" "+znajomi[nr].nazwisko+" "+znajomi[nr].numer);
        }
    }
}