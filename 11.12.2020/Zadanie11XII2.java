public class Zadanie11XII2{
	static boolean polidrom(char[] tab,int x){
		if(x>(int)(tab.length/2)) return true;
		else{
			if(tab[x]==tab[tab.length-1-x]){
				return polidrom(tab,(x+1));
			}else return false;
		}
	}
	
	public static void main(String[] args){
		char[] slowo = {'k','a','j','a','k'};
		
		System.out.println(polidrom(slowo,0));
	}
}