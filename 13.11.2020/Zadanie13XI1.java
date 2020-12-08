public class Zadanie13XI1{ 
    public static void main(String[] args){
		int dzien = 13;
		int miesiac = 11;
		int dni = 0;
		
		for(int i = 1; i<miesiac; i++){
			switch (i){
				case 1:
				dni=dni+31;
				break;
				case 2:
				dni=dni+28;
				break;
				case 3:
				dni=dni+31;
				break;
				case 4:
				dni=dni+30;
				break;
				case 5:
				dni=dni+31;
				break;
				case 6:
				dni=dni+30;
				break;
				case 7:
				dni=dni+31;
				break;
				case 8:
				dni=dni+31;
				break;
				case 9:
				dni=dni+30;
				break;
				case 10:
				dni=dni+31;
				break;
				case 11:
				dni=dni+30;
				break;
				case 12:
				dni=dni+31;
				break;
			}
		}
		
		dni=dni+dzien;
		
		System.out.println(dni);
	}
}