public class Zadanie20XI6{
	public static int jest(int x, int[] tab1,int[] tab2){
		for(int i=0;i<tab1.length;i++){
			if(tab1[i]==x){
				return 1;
			}
		}
		for(int i=0;i<tab2.length;i++){
			if(tab2[i]==x){
				return 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		int[] tab1 = {1,3,5,7,9,11,13,15,17,19,21};
		int[] tab2 = {1,2,4,5,8,9,10,12,15,18,19,20};
		
		System.out.print("\nSuma: \n");
		int[] tab3 = new int[tab1.length+tab2.length];
		for(int i=0;i<tab1.length;i++){
			tab3[i]=tab1[i];
		}
		for(int i=0;i<tab2.length;i++){
			tab3[i+tab1.length]=tab2[i];
		}
		for(int i=0;i<tab3.length;i++){
			System.out.print(tab3[i]+" ");
		}
		
		
		int[] tab4 = new int[(tab1.length>tab2.length)?tab1.length:tab2.length];
		int x = 0;
		for(int i=0;i<tab1.length;i++){
			for(int j=0;j<tab2.length;j++){
				if(tab1[i]==tab2[j]){
					tab4[x]=tab1[i];
					x++;
				}
			}	
		}
		System.out.print("\nWspolne elementy: \n");
		for(int i=0;i<tab4.length;i++){
			if(tab4[i]!=0)
			System.out.print(tab4[i]+" ");
		}
		
		
		System.out.print("\nNiewystepujace znajdujace sie w przedziale: \n");
		int najmniejsza=1000000,najwieksza=0;
		for(int i=0;i<tab1.length;i++){
			if(tab1[i]>najwieksza){
				najwieksza=tab1[i];
			}
			if(tab1[i]<najmniejsza){
				najmniejsza=tab1[i];
			}
		}
		for(int i=0;i<tab2.length;i++){
			if(tab2[i]>najwieksza){
				najwieksza=tab2[i];
			}
			if(tab2[i]<najmniejsza){
				najmniejsza=tab2[i];
			}
		}
		x=0;
		int tab5[]=new int[najwieksza-najmniejsza];
		for(int i=najmniejsza+1;i<najwieksza;i++){
			if(jest(i,tab1,tab2)==0){
				tab5[x]=i;
				x++;
			}
		}
		for(int i=0;i<tab5.length;i++){
			if(tab5[i]!=0)
			System.out.print(tab5[i]+" ");
		}
		
	}
}