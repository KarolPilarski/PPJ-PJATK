public class Zadanie17XI3{ 
    public static void main(String[] args){
		
		double waga=1.9;
		double odwaznik[]={1000,500,200,100,50,25,10,5,1};
		
		waga=waga*1000;
		
		if(waga>2500){
			System.out.println("Zbyt duza waga");
		}else{
			for(int i=0;i<9;i++){
				if(waga>odwaznik[i]){
					System.out.println((int)(waga/odwaznik[i])+" * "+((i!=0)?(int)odwaznik[i]+"g":"1kg"));
					waga=waga-((int)(waga/odwaznik[i]))*(odwaznik[i]);
				}
			}
		}
	}
}