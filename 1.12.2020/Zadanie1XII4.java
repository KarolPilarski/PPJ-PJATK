import java.util.Scanner;
public class Zadanie1XII4{
	
	public static int win(int[][] brd){
		for(int i=0;i<3;i++){
			if(((brd[i][0]+brd[i][1]+brd[i][2])==3)||((brd[i][0]+brd[i][1]+brd[i][2])==30)){
				return 1;
			}
			if(((brd[0][i]+brd[1][i]+brd[2][i])==3)||((brd[i][0]+brd[i][1]+brd[i][2])==30)){
				return 1;
			}
		}
			if(((brd[0][0]+brd[1][1]+brd[2][2])==3)||((brd[0][0]+brd[1][1]+brd[2][2])==30)||((brd[0][2]+brd[1][1]+brd[2][0])==3)||((brd[0][2]+brd[1][1]+brd[2][0])==30)){
				return 1;
			}
			return 0;
	}
	public static void kolko(int[][] brd){
		Scanner scan = new Scanner(System.in);
		int x,y;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print((brd[j][i]==1)?"O":(brd[j][i]==10)?"X":"."+" ");
			}	
			System.out.println();
		}
		
		System.out.println("Kolko: \nPodaj x(0-2):");
		x = scan.nextInt();
		System.out.println("Kolko: \nPodaj y(0-2):");
		y = scan.nextInt();
		brd[x][y]=1;
		if(win(brd)==1){
			System.out.println("WYGRALES");
		}else{
		krzyzyk(brd);
		}
	}
	public static void krzyzyk(int[][] brd){
		Scanner scan = new Scanner(System.in);
		int x,y;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print((brd[j][i]==1)?"O":(brd[j][i]==10)?"X":"."+" ");
			}
				System.out.println();
		}
		System.out.println("Krzyzyk: \nPodaj x(0-2):");
		x = scan.nextInt();
		System.out.println("Krzyzyk: \nPodaj y(0-2):");
		y = scan.nextInt();
		brd[x][y]=10;
		if(win(brd)==1){
			System.out.println("WYGRALES");
		}else{
		kolko(brd);
		}
	}
	
	public static void main(String[] args){
		
		int[][] board ={
			{0,0,0},
			{0,0,0},
			{0,0,0}
		};
		
		kolko(board);
	}
}