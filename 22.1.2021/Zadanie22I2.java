public class Zadanie22I2 {
    public static void main(String[] args) {

        DetektorDymu d1=new DetektorDymu(true);
        try{
        d1.sprawdz();
        }catch(Alarm a){
            System.out.println(a.getMessage());
        }
    }
}

class DetektorDymu{
    private boolean dym;
    DetektorDymu(boolean dym){
        this.dym=dym;
    }
    public void sprawdz() throws Alarm{
        if(dym){
            throw new Alarm("Alarm");
        }
    }
}

class Alarm extends Exception {
    public Alarm(String message) {
        super(message);
    }
}