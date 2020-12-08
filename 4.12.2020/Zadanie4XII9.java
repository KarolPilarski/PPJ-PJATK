public class Zadanie4XII9{
	static void printMonth(int miesiac, int rok){
		int pierwszydzienroku=2;
		if(rok>2020){
			pierwszydzienroku++;
			for(int i=2020;i<rok;i++){
				pierwszydzienroku=pierwszydzienroku+(YearDays(rok)%7);
				if(pierwszydzienroku>6) pierwszydzienroku=pierwszydzienroku-7;
			}
		}else{
			for(int i=2019;i>=rok;i--){
				pierwszydzienroku=pierwszydzienroku-(YearDays(rok)%7);
				if(pierwszydzienroku<0) pierwszydzienroku=pierwszydzienroku+7;
			}
		}
		int pierwszydzien=pierwszydzienroku;
		for(int i=1;i<miesiac;i++){
			pierwszydzien=pierwszydzien+(MonthDays(i,rok)%7);
			if(pierwszydzien>6) pierwszydzien=pierwszydzien-7;
		}
		int nb=1;
		System.out.println("  P  W  S  C  P  S  N");
		for(int i=0;i<MonthDays(miesiac,rok)+pierwszydzien;i++){
			if(i%7==0){
				if(i!=0)System.out.print("\n");
				System.out.print(nb+" ");
				nb++;
			}
			if(i<pierwszydzien){
				System.out.print("  ");
			}else{
				System.out.print((i-pierwszydzien+1)+(((i-pierwszydzien+1)<10)?" ":"")+" ");
			}
		}
	}
	
	static int MonthDays(int miesiac, int rok){
		switch(miesiac){
			case 1:
			return 31;
			case 2:
			if(rok%4==0)return 29;else return 28;
			case 3:
			return 31;
			case 4:
			return 30;
			case 5:
			return 31;
			case 6:
			return 30;
			case 7:
			return 31;
			case 8:
			return 31;
			case 9:
			return 30;
			case 10:
			return 31;
			case 11:
			return 30;
			case 12:
			return 31;
			default:
			return 0;
		}
	}
	
	static int YearDays(int rok){
		if(rok%4==0) return 366; else return 365;
	}
	
	public static void main(String[] args){
		int msc=12,rok=2021;
		
		printMonth(msc,rok);
	}
}