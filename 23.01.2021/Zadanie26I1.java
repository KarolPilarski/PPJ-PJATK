public class Zadanie26I1 {
    public static void main(String[] args) {
        String text="Rakieta to pojazd latający lub pocisk, napędzany silnikiem rakietowym. Obiekt ten uzyskuje siłę ciągu dzięki materii wyrzucanej z dużą prędkością. Na ogół są to gazy powstałe przy spalaniu paliwa. Czasem są to sprężone gazy lub przegrzana para. Siła działająca na rakietę (ciąg silnika rakietowego) jest wynikiem trzeciej zasady dynamiki Newtona. Często pojęcie rakiety jest używane w znaczeniu silnika rakietowego lub pocisku rakietowego. Rakiety służą między innymi do przenoszenia ładunku, np. statku kosmicznego, głowic bojowych, sztucznych satelitów w warunkach przestrzeni kosmicznej, gdzie nie ma żadnej zewnętrznej substancji, której pojazd mógłby użyć jako elementu napędzającego.";
        RandomFile(text).show();
    }
    static File RandomFile(String text){
        return (Math.random()>0.66)?(new File("ExampleFile",20,text)):(Math.random()>0.50)?(new SecretFile("ExampleFile",20,text)):(new TopSecretFile("ExampleFile",20,text));
    }
}
class File{
    protected String Name,Text;
    protected int Pages;
    File(String Name,int Pages, String Text){
        this.Name=Name;
        this.Pages=Pages;
        this.Text=Text;
    }
    void show(){
        System.out.println("Czy masz dostep?");
    }
}

class SecretFile extends File{
    SecretFile(String Name,int Pages, String Text){
        super(Name,Pages,Text);
    }
    @Override
    void show(){
        char[] arr=Text.toCharArray();
        int words=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' ') words++;
            if(words%5==0){
                System.out.print("*");

            }else{
                System.out.print(arr[i]);
            }
        }
    }
}


class TopSecretFile extends File{
    TopSecretFile(String Name,int Pages, String Text){
        super(Name,Pages,Text);
    }
    @Override
    void show(){
        char[] arr=Text.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i%2==1)System.out.print("*");
            else System.out.print(arr[i]);
        }
    }
}