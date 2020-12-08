public class Zadanie1XII2{
	public static void main(String[] args){
		
		int ilosc =(int)(Math.random()*20+5);
		
		int[] tX = new int [ilosc];
		int[] tY = new int [ilosc];
		
		int EPrawo=0,ELewo=100,EGora=0,EDol=100;
		
		System.out.println("Punkty: ");
		for(int i=0; i<ilosc;i++){
			tX[i]=(int)(Math.random()*100);
			tY[i]=(int)(Math.random()*100);
			System.out.println((i+1)+":   x:"+ tX[i]+ "   y:"+ tY[i]);
			if(tY[i]>EGora){
				EGora=tY[i];
			}
			if(tY[i]<EDol){
				EDol=tY[i];
			}
			if(tX[i]>EPrawo){
				EPrawo=tX[i];
			}
			if(tX[i]<ELewo){
				ELewo=tX[i];
			}
		}
	
		System.out.println("\n\nWysokosc prostokata: "+(EGora-EDol)+"\nSzerokosc prostokata: "+(EPrawo-ELewo)+"\nX srodka prostokata: "+((ELewo+EPrawo)/2)+"\nY srodka prostokata: "+((EGora+EDol)/2));
		
	}
}