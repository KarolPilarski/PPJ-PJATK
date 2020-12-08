public class Zadanie20XI1{
	public static void main(String[] args){
		long zmienna = -6172840429334713771L;
		long resz=0;
		long[] tab = new long[8];
		
		for(int i=0;i<tab.length;i++){
			tab[i]=((long)(0x0000000000000000FF)&(long)(zmienna>>8*i));
		}
		for(int i=tab.length-1;i>=0;i--){
			for(int j=7; j>=0;j--){
				if(((tab[i]>>j)&(0b00000001))==1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}	