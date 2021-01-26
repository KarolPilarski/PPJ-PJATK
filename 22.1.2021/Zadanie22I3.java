public class Zadanie22I3 {
    public static void main(String[] args) {
        Rakieta Rakieta1=new Rakieta("Rakieta1",1000);
        Rakieta1.zatankuj();
        try {
            Rakieta1.start();
        }catch(BrakPaliwa e){
            System.out.println(e.getMessage());
        }
    }
}
class Rakieta{
    public String nazwa;
    public int wagaPaliwa;
    Rakieta(String nazwa,int wagaPaliwa){
        this.nazwa=nazwa;
        this.wagaPaliwa=wagaPaliwa;
    }
    public void zatankuj(){
        wagaPaliwa=wagaPaliwa+(int)(Math.random()*1000+500);
    }
    public void start() throws BrakPaliwa{
        if(wagaPaliwa<1000) throw new BrakPaliwa(" ");
            else{System.out.println("Wziuuuu");}
    }
}

class BrakPaliwa extends Exception {
    public BrakPaliwa(String message) {
        super(message);
    }

}
