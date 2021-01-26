public class Zadanie8I2 {

    public static void main(String[] args) {
        Person Per1 = new Person("Maciek");
        Person Per2 = new Person("Mateusz", 1995);
        System.out.println(Per1.getName());
        System.out.println(Per2.getAge());

    }
}

class Person{

    String name;
    int birthYear;

    public Person(String name, int birthYear){
        this.name=name;
        this.birthYear=birthYear;
    }
    public Person(String name){
        this.name=name;
        this.birthYear=1990;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return 2021-birthYear;
    }

    public static Person getOlder(Person p1,Person p2){
        if(p1.getAge()>p2.getAge()) return p1;
        else return p2;
    }

    public static Person getOldest(Person[] tab){
        int Oldest = 0;
        for(int i=1;i<tab.length;i++){
            if(tab[i].getAge()>tab[Oldest].getAge()) Oldest=i;
        }
        return tab[Oldest];
    }
}