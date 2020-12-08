public class Zadanie10XI3{
	public static void main (String[] args){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		
		System.out.println("Podaj Wartosc:");
		double data=scan.nextInt();
		
		System.out.println("Podaj jednostke wejsciowa:");
		String fromUnit=scan.next();
		
		System.out.println("Podaj jednostke wyjsciowa:");
		String toUnit=scan.next();
	
		switch(fromUnit){
			case "g":
			break;
			case "dag":
			data=data*10;
			break;
			case "kg":
			data=data*1000;
			break;
			default:
			System.out.println("Niewlasciwa jednostka wejsciowa");
		}
		
		System.out.println("Wynik:");
		
		switch(toUnit){
			case "oz":
			System.out.println(data*0.0352739619+" oz");
			break;
			case "lb":
			System.out.println(data*0.00220462262+" lb");
			break;
			case "st":
			System.out.println(data*0.00015747304441777+" st");
			break;
			default:
			System.out.println("Niewlasciwa jednostka wyjsciowa");
		}
	}
}