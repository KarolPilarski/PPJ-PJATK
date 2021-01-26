public class Zadanie12I1 {
    public static void main(String[] args) {
        Atom Hel = new Atom("Hel",20,1);
        System.out.println(Hel);

        Kwadrat Kwd = new Kwadrat(6);
        Kwd.Show();

        Walec Wlc = new Walec(3,5);
        Wlc.Show();

        KulaW KW = new KulaW(Wlc);
        System.out.println(KW.getPromien());

        KulaNa KN = new KulaNa(Kwd);
        System.out.println(KN.getPromien());

        Wyraz Slowo = new Wyraz();
        Slowo.dodajZnak('S');
        Slowo.dodajZnak('l');
        Slowo.dodajZnak('o');
        Slowo.dodajZnak('w');
        Slowo.dodajZnak('o');
        Slowo.wyswietl();
        System.out.println(Slowo.length());
    }
}

class Atom{
    private String nazwa;
    private double masa;
    private int ladunek;

    public Atom(String nazwa,double masa,int ladunek){
        this.nazwa=nazwa;
        this.masa=masa;
        this.ladunek=ladunek;
    }

    public String toString(){
        return this.nazwa+" "+this.masa+" "+this.ladunek;
    }
}

class Kwadrat{
    private int bok;
    public Kwadrat(int bok){
        this.bok=bok;
    }

    public double getBok(){
        return this.bok;
    }

    public void Show(){
        System.out.println("Pole powierzchni kwadratu: "+(this.bok*this.bok));
        System.out.println("Objetosc szescianu: "+(this.bok*this.bok*this.bok));
    }
}

class Walec{
    private int promien;
    private int wysokosc;
    public Walec(int promien, int wysokosc){
        this.promien=promien;
        this.wysokosc=wysokosc;
    }
    public double getPromien(){
        return this.promien;
    }
    public double getWysokosc(){
        return this.wysokosc;
    }
    public void Show(){
        System.out.println("Pole powierzchni podstawy: "+(3.14*this.promien*this.promien));
        System.out.println("Objetosc walca: "+(3.14*this.promien*this.promien*this.wysokosc));
    }
}

class KulaW{
    private double promien;
    public KulaW(Walec W){
        if(W.getPromien()>(W.getWysokosc()/2)){
            this.promien=W.getWysokosc()/2;
        }else{
            this.promien=W.getPromien();
        }
    }
    public KulaW(Kwadrat W){
        this.promien=W.getBok()/2;
    }
    public double getPromien(){
        return this.promien;
    }
}

class KulaNa{
    private double promien;
    public KulaNa(Walec W){
        this.promien=Math.sqrt(W.getWysokosc()*W.getWysokosc()+W.getPromien()*W.getPromien())/2;
    }
    public KulaNa(Kwadrat W){
        this.promien=(W.getBok()*Math.sqrt(3))/2;
    }
    public double getPromien(){
        return this.promien;
    }
}

class Wyraz{
    private int dlugosc = 0;
    private char[] tab= new char[100];

    public void dodajZnak(char znak){
        tab[dlugosc]=znak;
        dlugosc++;
    }
    public void wyswietl(){
        for(int i=0;i<dlugosc;i++){
            System.out.print(tab[i]+" ");
        }
    }
    public int length(){
        return this.dlugosc;
    }
}