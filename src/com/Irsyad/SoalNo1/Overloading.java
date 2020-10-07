package com.Irsyad.SoalNo1;

public class Overloading {
    public String nama;
    public int tBerdiri;
    public String stadion;
    public int juaaraUcl;
    public String deskripsi;

    public  Overloading(){}

    public Overloading(String nama){
        this.nama = nama;
        this.tBerdiri = 1990;
        this.stadion = "Broadway Stadion";
        this.juaaraUcl = 2006;
        this.deskripsi = "Merupakan Basket Yang Takterkalahkan";
    }
    public Overloading(String nama, String deskripsi) {
        this.nama = nama;
        this.tBerdiri = 1976;
        this.stadion = "Gelora Bung Karno";
        this.juaaraUcl = 1998;
        this.deskripsi = deskripsi;
    }
    public Overloading(String nama, int tBerdiri, String stadion) {
        this.nama = nama;
        this.tBerdiri = tBerdiri;
        this.stadion = stadion;
        this.juaaraUcl = 2004;
        this.deskripsi = "Banyak orang berbakat didalamnya";

    }
    public Overloading(String nama, int tBerdiri, String stadion, int juaaraUcl, String deskripsi) {
        this.nama = nama;
        this.tBerdiri = tBerdiri;
        this.stadion = stadion;
        this.juaaraUcl = juaaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getDataOverloading(){
        System.out.println("CLUB");

        System.out.println("Nama\t\t\t: "+nama);
        System.out.println("Tahun Berdiri\t: "+tBerdiri);
        System.out.println("Stadion\t\t\t: "+stadion);
        System.out.println("Juara Ucl\t\t: "+juaaraUcl);
        System.out.println("Deskripsi\t\t: "+deskripsi);
        System.out.println();
    }
}
