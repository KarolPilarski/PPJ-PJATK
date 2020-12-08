public class Zadanie27XI7{
	public static void main(String[] args){
		int[][] tab ={
			{1,2,3,4,5,6},
			{7,8,9,10,11,12},
			{13,14,15,16,17,18},
			{19,20,21,22,23,24},
			{25,26,27,28,29,30},
			{31,32,33,34,35,36}
			};
			int cordX=0,cordY=0;
				
				for(int i=0;i<tab[1].length-1;i++){
					System.out.print(tab[cordY][cordX] + " ");
					cordX++;
				}
			for(int x = tab[1].length-1;x>0;x--){
				if((tab[1].length-1-x)%2==0){
						for(int i=0;i<x;i++){
							System.out.print(tab[cordY][cordX] + " ");
							cordY++;
						}
						for(int i=0;i<x;i++){
							System.out.print(tab[cordY][cordX] + " ");
							cordX--;
						}
				}else{
						for(int i=0;i<x;i++){
							System.out.print(tab[cordY][cordX] + " ");
							cordY--;
						}
						for(int i=0;i<x;i++){
							System.out.print(tab[cordY][cordX] + " ");
							cordX++;
						}
				}
			}
	}
}