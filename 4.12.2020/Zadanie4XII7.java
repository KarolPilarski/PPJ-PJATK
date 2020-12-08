public class Zadanie4XII7{
	static boolean polidrom(char[] x){
		int chk=0;
		for(int i=0;i<(int)(x.length/2);i++){
			if(x[i]!=x[x.length-1-i]) chk++;
		}
		if(chk>0) return false; else return true;
	}
	
	public static void main(String[] args){
		char[] slowo = {'k','a','j','a','k'};
		System.out.println(polidrom(slowo));
	}
}