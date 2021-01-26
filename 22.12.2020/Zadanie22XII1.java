public class Zadanie22XII1 {

    static boolean Check(int[] tI, String[] tS){
        for(int i=0;i<tI.length-1;i++){
            if(tI[i]==tI[i+1]-1) return true;
        }
        return false;
    }

    public static void selectionSort(String[] tS, int[] tI){
        for(int i=0;i<tI.length;i++){
            int MaxVal=100;
            int MaxIx=i;
            for(int j=i;j<tI.length;j++){
                if(tI[j]<MaxVal){
                    MaxVal=tI[j];
                    MaxIx=j;
                }
            }
            String tmpS = tS[i];
            int tmpI = tI[i];
            tS[i] = tS[MaxIx];
            tI[i] = tI[MaxIx];
            tS[MaxIx]=tmpS;
            tI[MaxIx]=tmpI;
        }
    }

    public static void bubbleSort(String[] tS, int[] tI) {
        int n=tI.length;
        do{
            for(int i=0;i<n-1; i++){
                if(tI[i]>tI[i+1]){
                    String tmpS = tS[i];
                    int tmpI = tI[i];
                    tS[i] = tS[i+1];
                    tI[i] = tI[i+1];
                    tS[i+1]=tmpS;
                    tI[i+1]=tmpI;
                }
            }
        n--;
        }while(n > 1);
    }

    public static void insertionSort(String[] tS, int[] tI){
        int n = tI.length;
        for (int i = 1; i < tI.length; ++i) {
            int kI = tI[i];
            String kS = tS[i];

            int j =i-1;
            while (j >= 0 && tI[j] > kI) {
                tI[j + 1] = tI[j];
                tS[j + 1] = tS[j];
                j = j - 1;
            }

            tI[j + 1]=kI;
            tS[j + 1]=kS;
        }
    }
    public static int[][] split(int[] tab, int Index){
        int[][] wynik = new int[2][tab.length];
        for(int i=0;i<tab.length;i++) wynik[(i>Index)?1:0][(i>Index)?i-Index:i]=tab[i];
        return wynik;
    }

    public static int[] mergeSort(int[] data1, int[] data2){
        int[] wynik = new int[data1.length+data2.length];
        int c1=0,c2=0;
        for(int i=0;i<wynik.length;i++){
            if(c1>=data1.length){
                wynik[i]=data2[c2];
                c2++;
            }else if(c2>=data2.length){
                wynik[i]=data1[c1];
                c1++;
            }else{
                if(data1[c1]<data2[c2]){
                    wynik[i]=data1[c1];
                    c1++;
                }else{
                    wynik[i]=data2[c2];
                    c2++;
                }
            }
        }
        return wynik;
    }


    public static void main(String[] args) {
        int[] tabInt ={1,2,3,4,5,6,7,8,9,10,11,12};
        String[] tabStr = {"Styczen","Luty","Marzec","Kwiecien","Maj","Czerwiec","Lipiec","Sierpien","Wrzesien","Pazdziernik","Listopad","Grudzien"};

        while (Check(tabInt, tabStr)) {
            int a = (int)(Math.random()*tabInt.length);
            int b = (int)(Math.random()*tabInt.length);

            String tmpS = tabStr[a];
            int tmpI = tabInt[a];
            tabStr[a] = tabStr[b];
            tabInt[a] = tabInt[b];
            tabStr[b]=tmpS;
            tabInt[b]=tmpI;
        }
        insertionSort(tabStr,tabInt);
        for(int i=0;i<tabInt.length;i++) System.out.println(tabInt[i]+" "+tabStr[i]);

        int[] t1 = {1,4,6,8,12};
        int[] t2 = {3,9,10,12,13,14,15};

        int[] t3= mergeSort(t1, t2);
        for(int i=0;i<t3.length;i++) System.out.println(t3[i]);
    }
}
