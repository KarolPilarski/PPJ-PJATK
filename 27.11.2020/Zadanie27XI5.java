public class Zadanie27XI5{
	public static void main(String[] args){
		int[] tab1 = new int[(int)(Math.random()*100)];
		int[] tab2 = new int[(int)(Math.random()*100)];
		int[] tab3 = new int[(int)(Math.random()*100)];
		
		for(int i=0;i<tab1.length;i++){
			tab1[i]=(int)(Math.random()*200);
		}
		for(int i=0;i<tab2.length;i++){
			tab2[i]=(int)(Math.random()*200);
		}
		for(int i=0;i<tab3.length;i++){
			tab3[i]=(int)(Math.random()*200);
		}
		
		int[][] tab4 = {tab1, tab2, tab3};
		
		for(int i=0;i<tab4.length;i++){
			for(int j=0;j<tab4[i].length;j++){
				System.out.print(tab4[i][j]+" ");
			}
			System.out.println();			
		}
	}
}