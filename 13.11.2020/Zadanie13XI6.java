public class Zadanie13XI6{ 
    public static void main(String[] args){
		for(int i =1;i<30;i++){
			System.out.print("\n");
			if(i%2==0){
				for(int j =1;j<12;j++){
				if(j%2==0){
				System.out.print("*");
				}else{
				System.out.print(" ");	
				}
				}
			}else{
				for(int k =1;k<12;k++){
				if(k%2==0){
				System.out.print(" ");
				}else{
				System.out.print("*");	
				}
				}			
			}
		}
	}
}