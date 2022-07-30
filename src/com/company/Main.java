package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println();
        Car car=new Car("BMW X7",2022,"Black","BMW","130000$");
        System.out.println();
        car.Malumot1();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        Car car1=new Car("Tesla S",2017,"Gray","Tesla","80000$");
        System.out.println();
        car1.Malumot2();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------");
        Car car2=new Car("Lambarghini sport",2020,"Yellow","Lambarghini","154000$");
        System.out.println();
        car2.Malumot3();
        System.out.println();

    }
}
