public class Zadanie8XII1{
	static int findMax(int[] x){
		int njw=0;
		for(int i=0;i<x.length;i++) {
            if(x[i]>njw) njw=x[i];
        }
		return njw;
	}
	static double findMax(double[] x){
		double njw=0;
		for(int i=0;i<x.length;i++) {
            if(x[i]>njw) njw=x[i];
        }
		return njw;
	}
	
	public static void main(String[] args){
		int[] tab1={2,5,6,4,3,5,3,5,35,3,5};
		double[] tab2={2,5,6,4,3,5,3,5,35,3,5};
		
		System.out.println(findMax(tab1)+"  "+findMax(tab2));
	}
}