public class Zadanie10XI2{
	public static void main (String[] args){
	int deg = (int)(Math.random() * 360);
	if(deg<45){
		System.out.println("Polnoc");
	}else{
		if(deg<90){
			System.out.println("Polnocny-wschod");
		}else{
			if(deg<135){
			System.out.println("Wschod");
			}else{
				if(deg<180){
					System.out.println("Poludniowy-wschod");
				}else{
					if(deg<225){
						System.out.println("Poludnie");
					}else{
						if(deg<270){
							System.out.println("Poludniowy-zachod");
						}else{
							if(deg<315){
								System.out.println("Zachod");
							}else{
								System.out.println("Polnocny-zachod");
							}						
						}					
					}				
				}				
			}	
		}	
	}
	
	}
}