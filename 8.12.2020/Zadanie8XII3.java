public class Zadanie8XII3{
	static boolean isArmstrongNumber(int x){
		int length=1;
		int l=x;
		int pwr=0;
		for(int i=10;i<x;i=i*10) length++;
		int[] tab=new int[length];
		for(int i=length-1;i>=0;i--){
			tab[i]=l%10;
			pwr=pwr+(int)(Math.pow(tab[i],length));
			l=l/10;
		}
		if(x==pwr) return true;else return false;
	}
	
	public static void main(String[] args){
		int liczba =1634;
		System.out.println(isArmstrongNumber(liczba));
	}
}