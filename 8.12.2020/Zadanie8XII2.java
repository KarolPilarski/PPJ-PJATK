public class Zadanie8XII2{
	static int[] splitToDigits(int x){
		int length=1;
		for(int i=10;i<x;i=i*10) length++;
		int[] result=new int[length];
		for(int i=length-1;i>=0;i--){
			result[i]=x%10;
			x=x/10;
		}
		return result;
	}
	
	public static void main(String[] args){
		int liczba = 2728172;
		int[] tab = splitToDigits(liczba);
		for(int i=0;i<tab.length;i++) System.out.print(tab[i]+" ");
	}
}