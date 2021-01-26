public class Zadanie15I3 {
    public static void main(String[] args) {
    CiagnikSiodlowy c1 = new CiagnikSiodlowy("niebieski",2,30);
    c1.rozpocznijJazde();
    }
}

class Pojazd{
    protected String color;
    Pojazd(String color){
        this.color=color;
    }
}

class PojazdKolowy extends Pojazd{
    protected int liczbaOsi;
    PojazdKolowy(String color, int liczbaOsi){
        super(color);
        this.liczbaOsi=liczbaOsi;
    }
}

class CiagnikSiodlowy extends PojazdKolowy{
    protected int masa;
    CiagnikSiodlowy(String color, int liczbaOsi, int masa){
        super(color, liczbaOsi);
        this.masa=masa;
    }

    public void rozpocznijJazde(){
        if((masa/liczbaOsi)>11) System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
    }
}


