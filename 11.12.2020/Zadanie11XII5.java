public class Zadanie11XII5{
	static void fill(int[][] tab, int x){
		if(x<=tab.length/2){
			for(int i =0+x;i<tab.length-x;i++){
				tab[i][0+x]=x+1;
				tab[i][tab.length-1-x]=x+1;
				tab[0+x][i]=x+1;
				tab[tab.length-1-x][i]=x+1;
			}
			fill(tab,x+1);
		}
	}
	
	public static void main(String[] args){
		int[][] tab = new int[16][16];
		
		fill(tab,0);
		
		for(int i=0;i<tab.length;i++) {
			for(int j=0;j<tab.length;j++) System.out.print(tab[i][j]+" ");
			System.out.println();
			}
	}
}