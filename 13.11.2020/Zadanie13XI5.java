public class Zadanie13XI5{ 
    public static void main(String[] args){
		double prev=0;
		for(int i =0;i<10;i++){
			System.out.println((1/Math.pow(2,i))+prev);
			prev=prev+(1/Math.pow(2,i));
		}
	}
}