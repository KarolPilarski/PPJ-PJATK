public class Zadanie4XII2{
	static void modifyValue(int x){
		System.out.println(x);
		x=x*5;
		System.out.println(x);
	}
	
	public static void main(String[] args){
		int wrt=5;
		System.out.println(wrt);
		modifyValue();
		System.out.println(wrt);
	}
}