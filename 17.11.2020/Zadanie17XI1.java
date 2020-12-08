public class Zadanie17XI1{ 
    public static void main(String[] args){
		byte in = 13;
		String out = "";
		for(int i=3;i>=0;i--){
			out=out+((in>>(i*2))&(0b00000011));
		}
		System.out.println(out);
	}
}