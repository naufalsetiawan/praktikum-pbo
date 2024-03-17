// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskrispi : Driver class 
// Tanggal   : 16/03/2024

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(8, 3, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
    }
}
