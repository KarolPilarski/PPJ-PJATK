public class Zadanie11XII3{
	public static void polidrom(char[] x){
		for(int i=(int)(x.length/2-1);i>=0;i--){
			System.out.print(x[i]);
		}
		for(int i=x.length-1;i>=((x.length%2==0)?(x.length/2):(int)(x.length/2)+1);i--){
			System.out.print(x[i]);
		}
	}
	public static void main(String[] args){
		char[] slowo = {'k','a','j','a','k'};
		polidrom(slowo);
	}
}