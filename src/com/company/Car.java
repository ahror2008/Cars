package com.company;

public class Car {
    String name;
    int year;
    String rangi;
    String cop;
    String price;

    public Car(String name, int year, String rangi, String cop, String price) {
        this.name = name;
        this.year = year;
        this.rangi = rangi;
        this.cop = cop;
        this.price = price;
        System.out.println("Nomi: "+ name);
        System.out.println("Yili: "+ year);
        System.out.println("Rangi: "+rangi );
        System.out.println("Korxona: "+ cop);
        System.out.println("Narxi: "+ price);
    }
    Car(){

    }
    public  void Malumot1(){
        System.out.println("BMW X7 dizayni: Jeep");
        System.out.println("BMW X7 tezligi: 300 km/h");
        System.out.println("BMW X7 matori: 5.0");
        System.out.println("BMW X7 Yoqilgi turi: Dizel");
        System.out.println("BMW X7 Ogirligi: 2395 dan 2555 kg gacha ");
    }
    public  void Malumot2(){
        System.out.println("Tesla S dizayni: Liftback");
        System.out.println("Tesla S tezligi: 250 km/h");
        System.out.println("Tesla S matori: elektromotor");
        System.out.println("Tesla S Yoqilgi: elektrga yuradi");
        System.out.println("Tesla S ogirligi: 2175 kg");
    }
    public  void Malumot3(){
        System.out.println("Lambarghini dizayni: sport car");
        System.out.println("Lambarghini tezligi: 350 km/h");
        System.out.println("Lambarghini matori:  5.5");
        System.out.println("Lambarghini yoqilgi: Benzin");
        System.out.println("Lambarghini ogirligi: 2500 ");
    }


}
