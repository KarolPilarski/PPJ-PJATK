public class Zadanie20XI2{
	public static void main(String[] args){
		double tab[10];
		for(int i=0;i<tab.lenght;i++){
			tab[i]=Math.random()*100;
		}
		
		System.out.println("Cała tablica:\n");
		for(int i=0;i<tab.lenghth;i++){
			System.out.print(tab[i]+ " ");
		}
		System.out.println("Parzyste indeksy:\n");
		for(int i=0;i<tab.length;i++){
			if(i%2==0){
				System.out.print(tab[i]+ " ");
			}
			
		}
		System.out.println("Nieoarzyste po konwersji na int:\n");
		for(int i=0;i<tab.length;i++){
			if((int)(tab[i])%2==1){
				System.out.print(tab[i]+ " ");
			}
			
		}
	}
}