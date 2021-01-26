public class zadanie10I2021 {
    public static void main(String[] args) {

    }
}

class Corn{
    int cornCount;
    public Corn(int cornCount){
        this.cornCount=cornCount;
    }

    public String toString(){
        return ""+this.cornCount;
    }

    public Popcorn[] makePopcorn(){
        Popcorn[] pops = new Popcorn[(int)(Math.random()*this.cornCount)];
        for(int i=0;i<pops.length;i++){
            pops[i]=new Popcorn();
        }
        return pops;
    }
}

class Popcorn{}