public class Zadanie6XI5{
	public static void main(String[] args){
		int W=10,X=5,Y=24,Z=13;
		
		if((W+X+Y+Z)>0xA){
			if((W>>4)%2==1){
				System.out.println(W);
			}
			if((X>>4)%2==1){
				System.out.println(X);
			}
			if((Y>>4)%2==1){
				System.out.println(Y);
			}
			if((Z>>4)%2==1){
				System.out.println(Z);
			}
		}else{
			if((W&0xA3)<5){
				System.out.println(W);
			}
			if((X&0xA3)<5){
				System.out.println(X);
			}
			if((Y&0xA3)<5){
				System.out.println(Y);
			}
			if((Z&0xA3)<5){
				System.out.println(Z);
			}	
		}
	}
}