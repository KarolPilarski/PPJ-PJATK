public class Zadanie20XI5{
	public static void main(String[] args){
		int[] tab = new int[14];
		
		for(int i =0;i<tab.length;i++){
			tab[i]=i;
		}
		int z,x,y;
		for(int i=0;i<100;i++){
			x=(int)(Math.random()*tab.length);
			y=(int)(Math.random()*tab.length);
			
			z=tab[x];
			tab[x]=tab[y];
			tab[y]=z;
		}
		
		for(int i =0;i<tab.length;i++){
			System.out.print(tab[i]);
		}
		System.out.println();	
		for(int i = 0;i<tab.length;i++){
			for(int j = 0;j<tab.length;j++){
				if(tab[j]==i){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}
			System.out.print("\n");
		}
	}
}