public class Zadanie1XII1{
	public static void main(String[] args){
		int[] tab1 = new int[10];
		int t1len=0;
		int[] tab2 = new int[100];
		
		for(int x=0;x<tab2.length;x++){
			t1len=0;
			e:
			while(true){
				tab1[t1len]=(int)(Math.random()*364);
				for(int i=0;i<t1len;i++){
					for(int j=0;j<t1len;j++){
						if((j!=i)&(tab1[i]==tab1[j])){
							break e;
						}
					}	
				}
				t1len++;
				if(t1len>=tab1.length){
					int size = 2*tab1.length;
					int[] tmp = new int[size];
					for(int i=0;i<tab1.length;i++){
						tmp[i]=tab1[i];
					}
					tab1=tmp;
				}
			}
			tab2[x]=t1len+1;
		}
		
		int suma = 0;
		for(int i=0;i<tab2.length;i++){
			suma= suma + tab2[i];
		}
		System.out.println(suma/tab2.length);
	}
}