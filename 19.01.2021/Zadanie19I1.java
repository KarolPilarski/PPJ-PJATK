public class Zadanie19I1 {
    public static void main(String[] args) {

    }
}

class Punkt2D{
    protected int x,y;
    Punkt2D(int x, int y){
        this.x=x;
        this.y=y;
    }
    public double odleglosc(Punkt2D A){
        return (Math.sqrt((this.x-A.x)+(this.y-A.y)));
    }
}

class Punkt3D extends Punkt2D{
    protected int z;
    Punkt3D(int x, int y, int z){
        super(x,y);
        this.z=z;
    }
    public double odleglosc(Punkt3D A){
        return (Math.sqrt((this.x-A.x)+(this.y-A.y)+(this.z-A.z)));
    }
}