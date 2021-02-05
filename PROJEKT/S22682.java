import java.io.*;
import java.lang.*;

import static java.lang.Integer.parseInt;


public class S22682 {
    public static void main(String[] args){
        AirObject[][] Radar = new AirObject[6][3000];
        int[] Count={0,0,0,0,0,0};
        String parameter1="0";
        int parameter2=1;
        if(args.length>0){
            parameter1=args[0];
            if(parameter1.equals("load")){
                parameter2=parseInt(args[1]);
                System.out.println("Wczytywanie z pliku "+parameter2+" razy...");
            }else if(parameter1.equals("save")) System.out.println("Zapisywanie do pliku...");
            else System.out.println("Niepoprawny parametr wejsciowy");
        }

        if(parameter1.equals("load")){
            try {
                ObjectInputStream Input = new ObjectInputStream(new FileInputStream("object.txt"));
                for (int i = 0; i < (140); i++) {
                    AirObject obj = (AirObject) Input.readObject();
                    if (obj != null) {
                        for(int j=0;j<parameter2;j++)LoadToArray(obj,Radar,Count);
                    }
                }
            }catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }else{
            try {
                ObjectOutputStream Output = new ObjectOutputStream(new FileOutputStream("object.txt"));
                for(int i=0;i<10;i++) {
                    WriteToArray(new CivilPlane(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), ((Math.random() > 0.5) ? "Odrzutowy" : "Smiglowy"), ((Math.random() > 0.5) ? 2 : 4), RandomCity(), RandomCity(), RandomAirline()), Radar, Count, parameter1, Output);
                    WriteToArray(new CargoPlane(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), ((Math.random() > 0.5) ? "Odrzutowy" : "Smiglowy"), ((Math.random() > 0.5) ? 2 : 4), RandomCity(), RandomCity(), RandomAirline(), (int) RandomDouble(50, 200)), Radar, Count, parameter1, Output);
                    WriteToArray(new Fighter(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), ((Math.random() > 0.5) ? "Odrzutowy" : "Smiglowy"), ((Math.random() > 0.5) ? 2 : 4), RandomCity(), RandomCity(), RandomCountry(), (Math.random() > 0.5)), Radar, Count, parameter1, Output);
                    WriteToArray(new Bomber(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), ((Math.random() > 0.5) ? "Odrzutowy" : "Smiglowy"), ((Math.random() > 0.5) ? 2 : 4), RandomCity(), RandomCity(), RandomCountry(), (int) (RandomDouble(0, 20))), Radar, Count, parameter1, Output);
                    WriteToArray(new CivilHelicopter(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), (int) RandomDouble(3, 6), RandomAirline()), Radar, Count, parameter1, Output);
                    WriteToArray(new MilitaryHelicopter(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), (int) RandomDouble(3, 6), RandomCountry(), Math.random() > 0.5), Radar, Count, parameter1, Output);
                    WriteToArray(new MedicalHelicopter(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), (int) RandomDouble(3, 6), (Math.random() > 0.5) ? "Publiczny" : "Prywatny"), Radar, Count, parameter1, Output);
                    WriteToArray(new PrivateDrone(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), (int) RandomDouble(2, 6), RandomAirline()), Radar, Count, parameter1, Output);
                    WriteToArray(new MilitaryDrone(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), (int) RandomDouble(2, 6), RandomCountry(), Math.random() > 0.5), Radar, Count, parameter1, Output);
                    WriteToArray(new Baloon(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), RandomDouble(5, 23)), Radar, Count, parameter1, Output);
                    WriteToArray(new Glider(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), RandomDouble(5, 13), RandomDouble(8, 18)), Radar, Count, parameter1, Output);
                    WriteToArray(new Paraglider(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), RandomDouble(8, 18)), Radar, Count, parameter1, Output);
                    WriteToArray(new Rocket(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomManufacturer(), RandomColor(), RandomDouble(15, 60), RandomSpaceAgency()), Radar, Count, parameter1, Output);
                    WriteToArray(new UFO(RandomDouble(-500, 500), RandomDouble(-500, 500), RandomDouble(0, 360), RandomDouble(0, 10000), RandomDouble(300, 700), RandomGalaxy(), RandomDouble(4, 30)), Radar, Count, parameter1, Output);
                }
                Output.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        SortRadar(Radar,Count);
        DisplayRadar(Radar, Count);

    }
    static void SortRadar(AirObject[][] tab,int[] Count){
        for(int i=0;i<6;i++){
            for(int j=1;j<Count[i];j++){
                AirObject Element = tab[i][j];
                int k=j-1;
                while((k>-1)&&(tab[i][k].Distance()>Element.Distance())){
                    tab[i][k+1]=tab[i][k];
                    k--;
                }
                tab[i][k+1]=Element;
            }
        }
    }
    static void DisplayRadar(AirObject[][] tab, int[] Count){
        for(int i=0;i<6;i++){
            System.out.println("Segment "+(i+1)+": ");
            for(int j=0;j<Count[i];j++){
                System.out.println(tab[i][j]);
            }
            System.out.println("\n\n");
        }
    }
    public static void WriteToArray(AirObject Object,AirObject[][] TabObj, int[] TabCnt,String par,ObjectOutputStream Save) throws java.io.IOException{
        int Check=0;
        while(Math.pow(3,(Check))<Object.Distance()){
            Check++;
        }
        Check--;
        TabObj[Check][TabCnt[Check]]=Object;
        TabCnt[Check]++;
        if(par.equals("save")) Save.writeObject(Object);
    }
    public static void LoadToArray(AirObject Object,AirObject[][] TabObj, int[] TabCnt){
            Object.PosX=RandomDouble(-500,500);
            Object.PosY=RandomDouble(-500,500);
            Object.Height=RandomDouble(1000,11000);
            int Check = 0;
            while (Math.pow(3, (Check)) < Object.Distance()) {
                Check++;
            }
            Check--;
            TabObj[Check][TabCnt[Check]] = Object;
            TabCnt[Check]++;
    }
    public static double RandomDouble(double min, double max){
        return Math.random()*(max-min)+min;
    }
    public static String RandomManufacturer(){
        String[] Names = {"Airbus","Boeing","Embraer","Bombardier Aviation","Cessna","Learjet","ATR","Tupolew","Kawasaki"};
        return Names[(int)(Math.random()*Names.length)];
    }
    public static String RandomSpaceAgency(){
        String[] Agencies={"SpaceX","NASA","RKA","JAXA","ESA","CNSA","ASA","CSIRO"};
        return Agencies[(int)(Math.random()*Agencies.length)];
    }
    public static String RandomColor() {
        String[] Colors = {"Bialy", "Niebieski", "Fioletowy", "Zielony", "Czarny", "Czerwony", "Pomaranczowy", "Brazowy", "Szary", "Rozowy", "Blekitny", "Kremowy", "Popielaty", "Srebrny", "Bordowy", "Ceglasty", "Brunatny", "Grafitowy", "Oliwkowy", "Granatowy", "Siny", "Sliwkowy"};
        return Colors[(int) (Math.random() * Colors.length)];
    }
    public static String RandomCity(){
        String[] Cities = {"Warszawa","Berlin","Londyn","Paryz","Dublin","Moskwa","Sztokholm","Oslo","Praga","Bratyslawa","Bukareszt","Budapeszt","Krakow","Gdansk","Kair","Osaka","Tokio","Kioto","Pekin","Szanghaj","Hongkong","Dzakarta","Toronto","Skawina","Reykjavik","Ottawa","Waszyngton","Los Angeles","Meksyk","Filadelfia","Chicago","Buenos Aires","Rio","Marakesz","Kapsztad","Sydney"};
        return Cities[(int) (Math.random() * Cities.length)];
    }
    public static String RandomCountry(){
        String[] Countries={"Polska","Niemcy","Japonia","USA","Francja","Czechy","Rosja","Wlochy","Wietnam","Indonezja","Chiny","Szwecja","Wielka Brytania","Kanada","Hiszpania"};
        return Countries[(int) (Math.random() * Countries.length)];
    }
    public static String RandomGalaxy() {
        String[] Galaxy = {"Droga Mleczny","Andromeda","Messier","Leo","Pisces","Eri"};
        return Galaxy[(int) (Math.random() * Galaxy.length)];
    }
    public static String RandomAirline(){
        String[] Airline={"Ryanair","Wizzair","LOT","Emirates","Lufthansa","easyJet","Cameroon Airlines","AirFrance","British Airways","KLM","Delta","American Airways","United Airlines","China Southern Airlines","China Easter Airlines","Singapore Airlines"};
        return Airline[(int)(Math.random()*Airline.length)];
    }
}
class AirObject implements Serializable {
   public double PosX, PosY, Vec, Height, Speed;
   AirObject(double PosX, double PosY, double Vec, double Height, double Speed){
       this.PosX=PosX;
       this.PosY=PosY;
       this.Vec=Vec;
       this.Height=Height;
       this.Speed=Speed;
   }
   AirObject(){}
   public double Distance(){
       return Math.sqrt(PosX*PosX+PosY*PosY);
   }
}

class ManMadeObject extends AirObject{
    protected String Manufacturer,Color;
    ManMadeObject(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color){
        super(PosX,PosY,Vec,Height,Speed);
        this.Manufacturer=Manufacturer;
        this.Color=Color;
    }
}
class Plane extends ManMadeObject{
    protected String EnginesType, Departure, Destination;
    protected int EnginesNumber;
    Plane(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, String EnginesType, int EnginesNumber, String Departure, String Destination){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color);
        this.EnginesType=EnginesType;
        this.EnginesNumber=EnginesNumber;
        this.Departure=Departure;
        this.Destination=Destination;
    }
}

class CivilPlane extends Plane{
    protected String Airline;
    CivilPlane(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, String EnginesType, int EnginesNumber, String Departure, String Destination, String Airline){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,EnginesType,EnginesNumber,Departure,Destination);
        this.Airline=Airline;
    }
    public String toString(){
        return "Samolot pasazerski:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Typ silnika: "+this.EnginesType+", Ilosc Silnikow: "+this.EnginesNumber+", Miejsce wylotu: "+this.Departure+", Cel podrozy: "+this.Destination+", Linia lotnicza:"+this.Airline;
    }
}

class CargoPlane extends Plane{
    protected String Company;
    protected int Capacity;
    CargoPlane(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, String EnginesType, int EnginesNumber, String Departure, String Destination, String Company, int Capacity){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,EnginesType,EnginesNumber,Departure,Destination);
        this.Company=Company;
        this.Capacity=Capacity;
    }
    public String toString(){
        return "Samolot towarowy:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Typ silnika: "+this.EnginesType+", Ilosc Silnikow: "+this.EnginesNumber+", Miejsce wylotu: "+this.Departure+", Cel podrozy: "+this.Destination+", Firma:"+this.Company+", Pojemnosc:"+this.Capacity;
    }
}

class MilitaryPlane extends Plane{
    protected String Country;
    MilitaryPlane(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, String EnginesType, int EnginesNumber, String Departure, String Destination, String Country){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,EnginesType,EnginesNumber,Departure,Destination);
        this.Country=Country;
    }
}

class Fighter extends MilitaryPlane{
    protected boolean Armed;
    Fighter(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, String EnginesType, int EnginesNumber, String Departure, String Destination, String Country, boolean Armed){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,EnginesType,EnginesNumber,Departure,Destination,Country);
        this.Armed=Armed;
    }
    public String toString(){
        return "Mysliwiec:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Typ silnika: "+this.EnginesType+", Ilosc Silnikow: "+this.EnginesNumber+", Miejsce wylotu: "+this.Departure+", Cel podrozy: "+this.Destination+", Kraj:"+this.Country+", Uzbrojony:"+this.Armed;
    }
}

class Bomber extends MilitaryPlane{
    protected int BombsNumber;
    Bomber(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, String EnginesType, int EnginesNumber, String Departure, String Destination, String Country, int BombsNumber){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,EnginesType,EnginesNumber,Departure,Destination,Country);
        this.BombsNumber=BombsNumber;
    }
    public String toString(){
        return "Bombowiec:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Typ silnika: "+this.EnginesType+", Ilosc Silnikow: "+this.EnginesNumber+", Miejsce wylotu: "+this.Departure+", Cel podrozy: "+this.Destination+", Kraj:"+this.Country+", Ilosc bomb:"+this.BombsNumber;
    }
}

class Helicopter extends ManMadeObject{
    protected int PropellerNumber;
    Helicopter(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, int PropellerNumber){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color);
        this.PropellerNumber=PropellerNumber;
    }
}

class CivilHelicopter extends Helicopter{
    protected String Owner;
    CivilHelicopter(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, int PropellerNumber, String Owner){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,PropellerNumber);
        this.Owner=Owner;
    }
    public String toString(){
        return "Helikopter cywilny:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Ilosc smigiel:"+this.PropellerNumber+", Wlasciciel: "+this.Owner;
    }
}

class MilitaryHelicopter extends Helicopter{
    protected String Country;
    protected boolean Armed;
    MilitaryHelicopter(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, int PropellerNumber, String Country, boolean Armed){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,PropellerNumber);
        this.Country=Country;
        this.Armed=Armed;
    }
    public String toString(){
        return "Helikopter wojskowy:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Ilosc smigiel:"+this.PropellerNumber+", Kraj: "+this.Country+", Uzbrojony: "+this.Armed;
    }
}

class MedicalHelicopter extends Helicopter{
    protected String HospitalType;
    MedicalHelicopter(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color, int PropellerNumber, String HospitalType){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,PropellerNumber);
        this.HospitalType=HospitalType;
    }
    public String toString(){
        return "Helikopter wmedyczny:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Ilosc smigiel:"+this.PropellerNumber+", Typ szpitala: "+this.HospitalType;
    }
}

class Drone extends ManMadeObject{
    protected int EnginesNumber;
    Drone(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color,int EnginesNumber){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color);
        this.EnginesNumber=EnginesNumber;
    }
}

class PrivateDrone extends Drone{
    protected String Owner;
    PrivateDrone(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color,int EnginesNumber, String Owner){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,EnginesNumber);
        this.Owner=Owner;
    }
    public String toString(){
        return "Dron prywatny:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Ilosc silnikow:"+this.EnginesNumber+", Wlasciciel: "+this.Owner;
    }
}

class MilitaryDrone extends Drone{
    protected String Country;
    protected boolean Armed;
    MilitaryDrone(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color,int EnginesNumber, String Country, boolean Armed){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color,EnginesNumber);
        this.Country=Country;
        this.Armed=Armed;
    }
    public String toString(){
        return "Dron Wojskowy:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Ilosc silnikow:"+this.EnginesNumber+", Kraj: "+this.Country+", Uzbrojony:"+this.Armed;
    }
}


class Baloon extends ManMadeObject{
    protected double Diameter;
    Baloon(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color,double Diameter){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color);
        this.Diameter=Diameter;
    }
    public String toString(){
        return "Balon:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Srednica: "+this.Diameter;
    }
}

class Glider extends ManMadeObject{
    protected double Length;
    protected double Wingspan;
    Glider(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color,double Length, double Wingspan){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color);
        this.Length=Length;
        this.Wingspan=Wingspan;
    }
    public String toString(){
        return "Szybowiec:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Dlugosc:"+this.Length+", Rozpietosc skrzydel: "+this.Wingspan;
    }
}

class Paraglider extends ManMadeObject{
    protected double Width;
    Paraglider(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color,double Width){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color);
        this.Width=Width;
    }
    public String toString(){
        return "Paralotnia:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Szerokosc:"+this.Width;
    }
}

class Rocket extends ManMadeObject{
    protected double Length;
    protected String SpaceAgency;
    Rocket(double PosX, double PosY, double Vec, double Height, double Speed, String Manufacturer, String Color,double Length, String SpaceAgency){
        super(PosX,PosY,Vec,Height,Speed,Manufacturer,Color);
        this.Length=Length;
        this.SpaceAgency=SpaceAgency;
    }
    public String toString(){
        return "Rakieta:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Producent: "+this.Manufacturer+", Kolor: "+this.Color+", Dlugosc:"+this.Length+", Agencja kosmiczna: "+this.SpaceAgency;
    }
}

class UFO extends AirObject{
    protected String Galaxy;
    protected double Diameter;
    UFO(double PosX, double PosY, double Vec, double Height, double Speed, String Galaxy, double Diameter){
        super(PosX,PosY,Vec,Height,Speed);
        this.Galaxy=Galaxy;
        this.Diameter=Diameter;
    }
    public String toString(){
        return "UFO:  Pozycja X: "+this.PosX+", Pozycja Y: "+this.PosY+", Wektor: "+this.Vec+", Pulap: "+this.Height+", Predkosc: "+this.Speed+", Z galaktyki: "+this.Galaxy+", Srednica: "+this.Diameter;
    }
}