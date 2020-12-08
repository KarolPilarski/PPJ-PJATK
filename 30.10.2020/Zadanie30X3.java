public class Zadanie30X3{ 
    public static void main(String[] args){
	byte bajt = 22;
	char znak = 10;
	int calk = 24;
	float flo = 7.5f;
	double doub = 12.5;
	
	char wynik1 = (char)(znak + calk);
	int wynik2 = calk + znak;
	float wynik3 = (float)(flo + doub);
	byte wynik4 = (byte)(bajt + calk);
	
	System.out.println(wynik1 + "\n" + wynik2 + "\n" + wynik3 + "\n" + wynik4);
	}
}