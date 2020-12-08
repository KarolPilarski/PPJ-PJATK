public class Zadanie17XI2{ 
    public static void main(String[] args){
		int size = 9;
		if(size%2==0){
			System.out.println("Liczba jest parzysta");
		}else{
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
				System.out.print("*");
				}
				System.out.print(" ");
				for(int j=0;j<size;j++){
					System.out.print(((i==0)||(i==size-1))?"*":((j==0)||(j==size-1))?"*":" ");
				}
				System.out.print("\n");
			}
			
		}
	}
}