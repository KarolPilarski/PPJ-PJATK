import java.util.Scanner;
public class Zadanie11XII4{
	static int fibonacci(int x){
		if(x==0){
			return 0;
		}else if(x==1){
			return 1;
		}
		return (fibonacci(x-1)+fibonacci(x-2));
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n = scan.nextInt();

		for(int i=1;i<=n;i++){
			System.out.println(fibonacci(i));
		}
	}
}