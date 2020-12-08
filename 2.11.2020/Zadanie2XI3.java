public class Zadanie2XI3{ 
    public static void main(String[] args){
		byte wynik = 0;
		
		wynik=(byte)(wynik+(Math.round(Math.random())));
		wynik=(byte)(wynik+(Math.round(Math.random())<<1));
		wynik=(byte)(wynik+(Math.round(Math.random())<<2));
		wynik=(byte)(wynik+(Math.round(Math.random())<<3));
		wynik=(byte)(wynik+(Math.round(Math.random())<<4));
		
		System.out.println(wynik);
	}
}