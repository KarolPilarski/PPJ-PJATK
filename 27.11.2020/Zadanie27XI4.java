public class Zadanie27XI4{
	public static void main(String[] args){
		int[][] tab = {
			{1,0,0,0,0},
			{0,1,0,0},
			{0,0,1}
		};
		int x=0,y=0;
		for(int i=0;i<tab.length;i++){
			x=x+tab[i].length;
		}
		int[] tab2 = new int[x];
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				tab2[y++]=tab[i][j];
			}
		}
	}
}