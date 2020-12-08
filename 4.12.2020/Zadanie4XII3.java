public class Zadanie4XII3{
	static int findMax(int x,int y,int z){
		if((x>y)&(x>z)){
			return x;
		}
		if((y>x)&(y>z)){
			return y;
		}
		return z;
	}
	
	static int findMaxTab(int[] x){
		najw=0;
		for(int i=0;i<x.length;i++){
			if(x[i]>najw){
				najw=x[i];
			}
		}
		return najw;
	}
	
	public static void main(String[] args){
		int x=3,y=5,z=4;
		System.out.println(findMax(x,y,z));
		
		int[] tab = {1,5,3,5,2,100,3,6,4,20};
		System.out.println(findMaxTab(tab));
	}
}