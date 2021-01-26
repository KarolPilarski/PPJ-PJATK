public class Zadanie22I1 {
    public static void main(String[] args) {
        Drzewo[] las ={(new DrzewoIglaste("Sosna",true,30,"aa",300,20)),
                (new DrzewoIglaste("Modrzewie",true,30,"ba",300,20)),
                (new DrzewoLisciaste("Deby",true,30,"ab",43)),
                (new DrzewoLisciaste("Osiki",true,30,"bb",300)),
                (new DrzewoOwocowe("Morelowce",true,30,"abab",300,"Morela")),
                (new DrzewoOwocowe("Sliwy",true,30,"baaa",300,"Sliwka"))
        };
        for(Drzewo e:las){
            try{
                e.zerwijOwoc();
            }catch(BrakOwocuException wyjatek){
                System.out.println(wyjatek.getMessage());
            }

            System.out.println(e);
        }
    }
}

class Drzewo{
    protected String nazwa;
    private boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    Drzewo(String nazwa, boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.nazwa=nazwa;
        this.wiecznieZielone=wiecznieZielone;
        this.wysokosc=wysokosc;
        this.przekrojDrzewa=przekrojDrzewa;
    }

    protected void zerwijOwoc() throws BrakOwocuException{
        throw new BrakOwocuException(" ");
    }

    @Override
    public String toString(){
        return ((wiecznieZielone)?"Wiecznie zielone":"Nie wiecznie zielone")+"\nWysokosc: "+wysokosc+"\nPrzekroj drzewa: "+przekrojDrzewa;
    }
    public boolean getwiecznieZielone(){
        return this.getwiecznieZielone();
    }

}

class DrzewoIglaste extends Drzewo{
    private int iloscIgiel;
    private double dlugoscSzyszki;
    DrzewoIglaste(String nazwa,boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,int iloscIgiel, double dlugoscSzyszki){
        super(nazwa,wiecznieZielone,wysokosc,przekrojDrzewa);
        this.iloscIgiel=iloscIgiel;
        this.dlugoscSzyszki=dlugoscSzyszki;
    }
    @Override
    public String toString(){
        return ((super.getwiecznieZielone())?"Wiecznie zielone":"Nie wiecznie zielone")+"\nWysokosc: "+wysokosc+"\nPrzekroj drzewa: "+przekrojDrzewa+"\nIlosc igiel: "+iloscIgiel+"\nDlugosc szyszki: "+dlugoscSzyszki;
    }

}

class DrzewoLisciaste extends Drzewo{
    protected int ksztaltLiscia;
    DrzewoLisciaste(String nazwa,boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,int ksztaltLiscia){
        super(nazwa,wiecznieZielone,wysokosc,przekrojDrzewa);
        this.ksztaltLiscia=ksztaltLiscia;
    }
    @Override
    public String toString(){
        return ((super.getwiecznieZielone())?"Wiecznie zielone":"Nie wiecznie zielone")+"\nWysokosc: "+wysokosc+"\nPrzekroj drzewa: "+przekrojDrzewa+"\nKsztalt liscia "+ksztaltLiscia;
    }
}

class DrzewoOwocowe extends DrzewoLisciaste{
    private String nazwaOwocu;
    DrzewoOwocowe(String nazwa,boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,int ksztaltLiscia,String nazwaOwocu){
        super(nazwa,wiecznieZielone,wysokosc,przekrojDrzewa,ksztaltLiscia);
        this.nazwaOwocu=nazwaOwocu;
    }
    @Override
    public String toString(){
        return ((super.getwiecznieZielone())?"Wiecznie zielone":"Nie wiecznie zielone")+"\nWysokosc: "+wysokosc+"\nPrzekroj drzewa: "+przekrojDrzewa+"\nKsztalt liscia; "+ksztaltLiscia+"\nNazwa owocu:"+nazwaOwocu;
    }
    @Override
    protected void zerwijOwoc() throws BrakOwocuException{
        System.out.println("Owoc zerwany");
    }
}

class BrakOwocuException extends Exception {

    public BrakOwocuException(String message) {
        super(message);
    }

}