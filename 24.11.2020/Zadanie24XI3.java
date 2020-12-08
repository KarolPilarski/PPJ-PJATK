public class Zadanie24XI3{
	public static int policz(int[] tab){
		int ilosc=tab.length;
		for(int i=0;i<tab.length;i++){
			for(int j=i;i>=0;i--){
				if(tab[i]==tab[j]){
					ilosc--;
					break;
				}
			}
		}
		return ilosc;
	}
	
	public static void main(String[] args){
		int[] tab1 = new int[10];
		int[] tab2 = new int[10];
		for(int i=0;i<tab1.length;i++){
			tab1[i]=i;
		}
		for(int i=tab2.length-1;i>=0;i++){
			tab2[i]=i;
		}
		
		int[] tab3 = new int[10];
		for(int i=0;i<tab3.length;i++){
			tab3[i]=tab1[i]+tab2[i];
		}
		
		int[] tab4 = new int[policz(tab3)];
		int z=0;
		boolean x=true;
		for(int i=0;i<tab3.length;i++){
			x=true;
			for(int j=i;i>=0;i--){
				if(tab3[i]==tab3[j]){
					x=false;
				}
			}
			if(x==true){
				tab4[z]=tab3[i];
				z++;
			}
		}
		
	}
}	