public class Zadanie1XII3{
	public static void main(String[] args){
		int[] A = {1,3,4,6,9,11,14};
		int[] B = {12,8,5,3,2,1};
		int Al=0,Bl=B.length-1;
		int[] C = new int[(A.length>B.length)?A.length:B.length];
		
		for(int i=0;i<C.length;i++){
			if((Bl>=0)&(Al<A.length)){
				if(A[Al]>B[Bl]){
					C[i]=A[Al];
				}else{
					C[i]=B[Bl];
				}
				Al++;
				Bl--;
			}else if(Bl<0){
				C[i]=A[Al];
				Al++;
			}else{
				C[i]=B[Bl];
				Bl--;
			}
			System.out.print(C[i]+" ");
		}
	}
}