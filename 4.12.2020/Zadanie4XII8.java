public class Zadanie4XII8{
	static boolean sprawdz(int[][] x){
		int chk=0;
		for(int i=3;i<=x.length;i=i+2){
			for(int j=0;j<x.length-i;j++){
				for(int k=0;k<x.length-i;k++){
					//lewa przekątna
					chk=0;
					for(int l=0;l<i;l++){
						for(int m=0;m<i;m++){
							if(((m<l)&(x[j+l][k+m]!=0))||((m>l)&(x[j+l][k+m]!=1))) chk++;
						}	
					}
					if(chk==0) return true;
					//prawa przekatna
					chk=0;
					for(int l=0;l<i;l++){
						for(int m=0;m<i;m++){
							if(((m<i-1-l)&(x[j+l][k+m]!=0))||((m>i-1-l)&(x[j+l][k+m]!=1))) chk++;
						}	
					}
					if(chk==0) return true;
				}	
			}
		}
		return false;
		
	}
	
	public static void main(String[] args){
		int[][] tab = new int[25][25];
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				tab[i][j]=(int)(Math.random()*2);
			}
		}
		System.out.println(sprawdz(tab));
	}
}