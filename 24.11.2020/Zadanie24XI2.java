public class Zadanie24XI2{
	
	public static boolean sprawdz(int[] tab){
		int suma=0;
		for(int i=0;i<tab.length;i++){
			suma=suma+tab[i];
		}
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab.length;j++){
				if(i!=j){
					if(tab[i]+tab[j]>suma-tab[i]-tab[j]){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] tab = {3,5,3,2,1,5,10};
		
		System.out.println(sprawdz(tab));
	}
}