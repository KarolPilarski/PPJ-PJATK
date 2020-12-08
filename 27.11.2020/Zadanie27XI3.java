public class Zadanie27XI3{
	public static void main(String[] args){
		
		int size = 20;
		int pmcint=0;
		double pmcdbl=0;
		int[] tbint = new int[size];
		double[] tbdbl = new double[size];
		
		for(int i=0; i<size; i++){
			tbint[i]=(int)(Math.random()*100);
			tbdbl[i]=Math.random()*100;
		}
		do{
		for(int i=0;i<size-1;i++){
			if(tbint[i]+tbdbl[i]>tbint[i+1]+tbdbl[i+1]){
				pmcdbl=tbdbl[i];
				tbdbl[i]=tbdbl[i+1];
				tbdbl[i+1]=pmcdbl;
				
				pmcint=tbint[i];
				tbint[i]=tbint[i+1];
				tbint[i+1]=pmcint;
			}
		}
		size--;
		}while(size>1);
	}
}