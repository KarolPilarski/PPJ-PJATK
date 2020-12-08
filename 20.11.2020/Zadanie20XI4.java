public class Zadanie20XI4{
	
	public static int empty(char[] t){
		for(int i=0;i<5;i++){
			if(t[i]!=0){
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args){
		java.util.Scanner in=new java.util.Scanner(System.in);
		
		char[] tab = new char[5];
		for(int i=0;i<5;i++){
			tab[i]=(char)((int)(Math.random()*26)+'A');
		}
		
		while(empty(tab)==0){
			int z=0;
			System.out.println("Podaj litere: ");
			char c=in.next().charAt(0);
			for(int i=0;i<5;i++){
				if(tab[i]==c){
					z++;
					tab[i]=0;
				}
			}
			System.out.print(": "+z);
		}
	}
}