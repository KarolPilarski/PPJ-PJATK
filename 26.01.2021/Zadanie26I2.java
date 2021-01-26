import java.io.FileInputStream;
import java.io.IOException;

public class Zadanie26I2 {
    public static void main(String[] args) throws IOException {
        char[] znaki=new char[100];
        int[] ilosc=new int[100];
        int k=0;

        FileInputStream f = new FileInputStream("data.txt");

        int b=0;

        while ((b = f.read()) != -1) {
            int num=101;
            for(int i=0;i<k;i++){
                if(znaki[i]==(char)b) num=i;
            }
            if(num==101){
                znaki[k]=(char)b;
                k++;
            }else{
                ilosc[num]++;
            }
        }

        f.close();

        for(int i=0;i<=k;i++){
            System.out.println(znaki[i]+": "+ilosc[i]);
        }
    }
}
