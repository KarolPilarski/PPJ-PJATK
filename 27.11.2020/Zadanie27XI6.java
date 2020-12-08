public class Zadanie27XI6{
	public static void main(String[] args){
		
		float[][] tab= new float[8][8];
		
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				tab[i][j]=(float)(Math.random()*30);
			}	
		}
		
		float SLP=0,SPP=0;
		
		for(int i=0;i<tab.length;i++){
			SLP=SLP+tab[i][i];
			SPP=SPP+tab[i][tab.length-1-i];
		}
		System.out.println("Suma lewej przekatnej: "+SLP+"\nSuma prawej przekatnej: "+SPP);
	}
}