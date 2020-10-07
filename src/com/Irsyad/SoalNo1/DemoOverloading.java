package com.Irsyad.SoalNo1;

public class DemoOverloading {
    public static void main(String[] args) {

        Overloading overloading1 = new Overloading("Basket");
        Overloading overloading2 = new Overloading("Futsal","Banyak Keluaran yg menjadi tim Liga besar");
        Overloading overloading3 = new Overloading("Melukis",1989,"Art Home");
        Overloading overloading4 = new Overloading("Gamers",2006,"The Ultimate",2014,"apapun game yang kamu cari pasti ada disini");


        overloading1.getDataOverloading();
        overloading2.getDataOverloading();
        overloading3.getDataOverloading();
        overloading4.getDataOverloading();

    }
}
