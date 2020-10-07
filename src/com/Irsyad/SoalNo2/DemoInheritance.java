package com.Irsyad.SoalNo2;

public class DemoInheritance {
    public static void main(String[] args) {
        Binatang superclass = new Binatang();
        Burung subClass = new Burung();
        Ikan subClas = new Ikan();
        Kucing subClasss = new Kucing();

        System.out.println("Binatang :");
        superclass.makan = "Pakan Ternak";
        superclass.tidur = "Merem";
        superclass.printmt();

        System.out.println();
        System.out.println("Burung");
        subClass.namab = "Kakatua";
        subClass.getNama();
        subClass.makan = "Biji-bijian";
        subClass.tidur = "Di Pohon";
        subClass.printmt();

        System.out.println();
        System.out.println("Ikan");
        subClas.namai = "Hiu";
        subClas.getNama();
        subClas.makan = "Daging";
        subClas.tidur = "Di Kapal Rusak";
        subClas.printmt();

        System.out.println();
        System.out.println("Kucing");
        subClasss.namak = "Anggora";
        subClasss.getNama();
        subClasss.makan = "Pelet";
        subClasss.tidur = "Kandang";
        subClasss.printmt();
    }
}
