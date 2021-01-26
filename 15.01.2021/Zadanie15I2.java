public class Zadanie15I2 {
    public static void main(String[] args) {
        Spawacz s1 = new Spawacz("Juan",20);
        System.out.println(s1);
    }
}

class Osoba{
    private String imie;
    Osoba(String imie){
        this.imie=imie;
    }
    public String getImie(){
        return this.imie;
    }
    public String toString(){
        return "imie: "+imie;
    }
}
class Spawacz extends Osoba{
    private int stazpracy;
    Spawacz(String imie,int stazpracy){
        super(imie);
        this.stazpracy=stazpracy;
    }
    @Override
    public String toString(){
        return "Imie: "+super.getImie()+" \nStaz pracy: "+stazpracy;
    }
}