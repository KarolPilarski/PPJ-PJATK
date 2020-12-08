public class Zadanie24XI1{
	public static void main(String[] args){
		boolean[] tab1 = {true,false,false,true,true,false,true,false,true,true,false,false,true,};
		int fcount=0,tcount=0;
		
		for(int i=0;i<tab1.length;i++){
			if(tab1[i]==true){
				tcount++;
			}else{
				fcount++;
			}
		}
		
		boolean[] tabfalse = new boolean[fcount];
		boolean[] tabtrue = new boolean[tcount];
		
		for(int i=0;i<tabfalse.length;i++){
			tabfalse[i]=false;
		}
		for(int i=0;i<tabtrue.length;i++){
			tabtrue[i]=true;
		}
	}
}