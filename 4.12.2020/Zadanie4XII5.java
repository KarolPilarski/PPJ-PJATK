public class Zadanie4XII5{
	static void fill(int[] x){
		for(int i=0;i<x.length;i++){
			x[i]=(int)(Math.random()*100);
		}
	}
	
	static int[] res(int[] x, int[] y, int prm){
		if(x.length==y.length) return null;
		
		if(prm<0){
			int[] result = new int[(x.length>y.length)?x.length:y.length];
			for(int i=0;i<result.length;i++){
				if((i<x.length)&(i<y.length)){
					result[i]=x[i]+y[i];
				}else if((i>=x.length)){
					result[i]=y[i];
				}else{
					result[i]=x[i];
				}
			}
			return result;
		}else{
			int[] result = new int[(x.length>y.length)?x.length-y.length:y.length-x.length];
			for(int i=0;i<result.length;i++){
				if(x.length>y.length){
					result[i]=x[x.length-result.length+i];
				}else{
					result[i]=y[y.length-result.length+i];
				}
			}
			return result;
		}
	}
	
	public static void main(String[] args){
		int[] t1 = new int[(int)(Math.random()*20+5)];
		int[] t2 = new int[(int)(Math.random()*20+5)];
		int prm=-3;
		
		fill(t1);
		fill(t2);
		
		res(t1,t2,prm);
	}
}