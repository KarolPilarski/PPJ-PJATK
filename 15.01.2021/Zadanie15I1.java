public class Zadanie15I1 {
    public static void main(String[] args) {
        Graniastoslup g1= new Graniastoslup(3,10);
        System.out.println(g1);

        Ostroslup o1 = new Ostroslup(5,5);
        System.out.println(o1);
    }
}

class Trojkat{
    protected int bok;
    Trojkat(int bok){
        this.bok=bok;
    }
    private int PolePow(){
        return (int)((bok*bok*Math.sqrt(3))/4);
    }
    @Override
    public String toString(){
        return ("Pole powierzchni: "+this.PolePow());
    }
}

class Ostroslup extends Trojkat{
    private int wys;
    Ostroslup(int bok, int wys) {
        super(bok);
        this.wys = wys;
    }
    public int PolePow(){
        return (int)((bok*bok*Math.sqrt(3))/4);
    }
    public int Obj(){
        return (int)(this.PolePow()*wys*(0.3333333));
    }
    @Override
    public String toString(){
        return ("Pole powierzchni: "+this.PolePow()+"\nObjetosc: "+this.Obj());
    }
}

class Graniastoslup extends Trojkat{
    private int wys;
    Graniastoslup(int bok, int wys) {
        super(bok);
        this.wys = wys;
    }
    private int PolePow(){
        return (int)((bok*bok*Math.sqrt(3))/4)*2+bok*wys*3;
    }
    private int Obj(){
        return ((int)((bok*bok*Math.sqrt(3))/4)*wys);
    }
    @Override
    public String toString(){
        return ("Pole powierzchni: "+this.PolePow()+"\nObjetosc: "+this.Obj());
    }
}