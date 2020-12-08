public class Zadanie4XII4{
	static void vd(char[] x){
		int cnt;
		for(int i=0;i<x.length;i++){
			cnt=0;
			if(check(x,i)==1){
				for(int j=i;j<x.length;j++){
					if(x[i]==x[j])cnt++;
				}
				System.out.println(x[i]+" : "+cnt);
			}
		}
	}
	
	static int check(char[] x,int pos){
		for(int i=0;i<pos;i++){
			if(x[pos]==x[i]){
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args){
	char[] txt = {'a','l','a',' ','m','a',' ','k','o','t','a'};
	vd(txt);
	}
}