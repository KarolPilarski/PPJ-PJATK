public class Zadanie27XI2{
	public static void main(String[] args){
		int tab[] = {1,6,3,2,1,3,5,4,2,1,3,3,2,-5,-2,-10};
		
		int najblizej=300,inxa=0,inxb=0;
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab.length;j++){
				if((i!=j)&(Math.abs(tab[i]+tab[j])<najblizej)){
					inxa=i;
					inxb=j;
					najblizej=Math.abs(tab[i]+tab[j]);
				}
			}	
		}
		System.out.println("Liczba 1: "+tab[inxa]+"\nLiczba 2: "+tab[inxb]+"\nSuma: "+(tab[inxa]+tab[inxb]));
	}
}