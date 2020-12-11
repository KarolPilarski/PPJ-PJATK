public class Zadanie11XII1{
	public static boolean check(int[][] a, int[][] b){
		if((a.length==b.length)&(a[0].length==b[0].length)){
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					if(b[i][j]!=a[i][j]) return false;
				}
			}
			return true;
		}else return false;
	}
	
	public static void main(String[] args){
		int[][] tab1 = {
			{6,4,5,8,4,3,6,3,5},
			{2,7,5,3,2,5,7,5,6},
			{0,0,5,3,6,4,3,5,3},
			{4,4,4,2,8,5,3,6,3},
			{8,6,4,2,6,4,2,1,5}
		};
		int[][] tab2 = {
			{6,4,5,8,4,3,6,3,5},
			{2,7,5,3,2,5,7,5,6},
			{0,0,5,3,6,4,3,5,3},
			{4,4,4,2,8,5,3,6,3},
			{8,6,4,2,6,4,2,1,5}
		};
		
		System.out.println(check(tab1,tab2));
	}
}