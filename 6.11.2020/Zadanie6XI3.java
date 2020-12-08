public class Zadanie6XI3{
	public static void main(String[] args){
			boolean czyPada = (Math.random()>0.5)?true:false;
			boolean czySwieciSlonce = (Math.random()>0.5)?true:false;
			
			byte X = (byte)(((czyPada==true)?0b00000001:0b000000000) + ((czySwieciSlonce==true)?0b000000010:0b000000000));
			
			if(X%2==1){
				if(X>=2){
					System.out.println("Tecza");
				}else{
					System.out.println("Plucha");
				}	
			}else{
				if(X>=2){
					System.out.println("Slonecznie");
				}else{
					System.out.println("Pochmurno");
				}	
			}
	
	}
}