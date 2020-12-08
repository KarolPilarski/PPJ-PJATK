public class Zadanie8XII4{
	public static int[][]calculateSquares(int screenWidth,int screenHeight,int side){
		int[][] result = new int[screenHeight][screenWidth];
		System.out.println("Zmiesci sie "+((screenHeight/side)*(screenWidth/side))+"kwardatow");
		for(int i=0;i<(screenHeight/side);i++){
			for(int j=0;j<(screenWidth/side);j++){
				result[i*side][j*side]=1;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int[][] tab = calculateSquares(20,15,5);
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				if(tab[i][j]==1) System.out.println("x: "+i+"   y: "+j);
			}
		}
	}
}