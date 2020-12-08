public class Zadanie20XI3{
	public static void main(String[] args){
		char[] tab={'P','U','C'};
		
		int najmniejsza=0;
		for(int i = 1;i<tab.length;i++){
			if(tab[i]<tab[i-1]){
				najmniejsza=i;
			}
		}
	System.out.println(najmniejsza);
	}
}