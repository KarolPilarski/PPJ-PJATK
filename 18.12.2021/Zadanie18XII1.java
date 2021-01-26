public class Zadanie18XII1 {
    public static int fiboR(int n){
        if(n==1||n==2){
            return 1;
        }
        return fiboR(n-1)+fiboR(n-2);
    }
    public static int fiboI(int n){
        int prev1=1;
        int prev2=1;
        for(int i=0;i<n-2;i++){
            if(prev1>prev2) prev2=prev2+prev1;
            else prev1=prev1+prev2;
        }
        return (prev1>prev2)?prev1:prev2;
    }
    public static int factR(int n){
        if(n==1)return 1;
        return n*factR(n-1);
    }
    public static int factI(int n){
        int wynik =1;
        for(int i=n;i>0;i--) wynik=wynik*i;
        return wynik;
    }
    public static int gcdR(int a, int b){
        if(a==0)return b;
        if(b==0) return a;
        return gcdR(b,a%b);
    }
    public static int gcdI(int a, int b){
        while(b!=0&a!=0){
            if(a>b) a=a%b;
            else if(a<b) b=b%a;
        }
        return (a>b)?a:b;
    }

    public static int maxElem(int[] arr, int from){
        int liczba =0;
        if(from==arr.length) return liczba;
        if(liczba>arr[from]) return maxElem(arr,from+1,liczba);
        else return maxElem(arr,from+1,arr[from]);
    }
    public static int maxElem(int[] arr, int from,int liczba){
        if(from==arr.length) return liczba;
        if(liczba>arr[from]) return maxElem(arr,from+1,liczba);
            else return maxElem(arr,from+1,arr[from]);
    }

    public static int numEven(int[] arr, int from){
        int num = 0;
        if(from==arr.length) return num;
        return numEven(arr,from+1,(num+((arr[from]%2==0)?1:0)));
    }
    public static int numEven(int[] arr, int from,int num){
        if(from==arr.length) return num;
        return numEven(arr,from+1,(num+((arr[from]%2==0)?1:0)));
    }

    public static int[] reverse(int[] arr, int from){
        if(from==arr.length) return arr;
        int tmp=arr[from];
        arr[from]=arr[arr.length-1-from];
        arr[arr.length-1-from]=tmp;
        return reverse(arr,from+1);
    }


    public static void main(String[] args) {
        int[] tab ={10,2,4,2,1,100};
        reverse(tab,3);
        for(int i=0;i<tab.length;i++) System.out.println(tab[i]+" ");
    }
}
