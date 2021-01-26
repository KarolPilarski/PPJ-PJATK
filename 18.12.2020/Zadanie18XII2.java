public class Zadanie18XII2 {
    static void Wypisz(int n){
        char[] arr = new char[n];
        for(int i=0;i<n;i++) arr[i]=(char)('A'+i);
        int ilosc=factR(n);
        WypiszR(ilosc,arr);
    }
    static void WypiszR(int n, char[] arr){
        if(n>0){
            char tmp = arr[(factR(arr.length)-n)%(arr.length-1)];
            arr[(factR(arr.length)-n)%(arr.length-1)] = arr[(factR(arr.length)-n)%(arr.length-1)+1];
            arr[(factR(arr.length)-n)%(arr.length-1)+1] = tmp;
            for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
            System.out.println();
            WypiszR(n-1,arr);
        }
    }
    public static int factR(int n){
        if(n==1)return 1;
        return n*factR(n-1);
    }
    public static void main(String[] args) {
        Wypisz(4);
    }
}
