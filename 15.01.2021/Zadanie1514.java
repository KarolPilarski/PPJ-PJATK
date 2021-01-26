public class Zadanie1514 {
    public static void main(String[] args) {
        Drzewo[] las = new Drzewo[6];

    }
}

class Drzewo{
    private boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone=wiecznieZielone;
        this.wysokosc=wysokosc;
        this.przekrojDrzewa=przekrojDrzewa;
    }

    protected void zerwijOwoc() throws BrakOwocuException{
        
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
    DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,int iloscIgiel, double dlugoscSzyszki){
        super(wiecznieZielone,wysokosc,przekrojDrzewa);
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
    DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,int ksztaltLiscia){
        super(wiecznieZielone,wysokosc,przekrojDrzewa);
        this.ksztaltLiscia=ksztaltLiscia;
    }
    @Override
    public String toString(){
        return ((super.getwiecznieZielone())?"Wiecznie zielone":"Nie wiecznie zielone")+"\nWysokosc: "+wysokosc+"\nPrzekroj drzewa: "+przekrojDrzewa+"\nKsztalt liscia "+ksztaltLiscia;
    }
}

class DrzewoOwocowe extends DrzewoLisciaste{
    private String nazwaOwocu;
    DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa,int ksztaltLiscia,String nazwaOwocu){
        super(wiecznieZielone,wysokosc,przekrojDrzewa,ksztaltLiscia);
        this.nazwaOwocu=nazwaOwocu;
    }
    @Override
    public String toString(){
        return ((super.getwiecznieZielone())?"Wiecznie zielone":"Nie wiecznie zielone")+"\nWysokosc: "+wysokosc+"\nPrzekroj drzewa: "+przekrojDrzewa+"\nKsztalt liscia; "+ksztaltLiscia+"\nNazwa owocu:"+nazwaOwocu;
    }
}