// Nama     : Muhammad Naufal Rifqi Setiawan
// NIM      : 24060122130045
// Deskripsi: Kelas Driver
// Tanggal  : 17/03/2024

package org.main;

import org.orang.Orang;
import org.mahasiswa.*;
import org.walimahasiswa.*;

public class Main {
    public static void main(String[] args) {

        Orang o1 = new Orang("Caelus", "1222");
        o1.cetak();
        WaliMahasiswa w1 = new WaliMahasiswa("Ratio", "1224", "089888", "Tembalang");
        Mahasiswa m1 = new Mahasiswa("Stelle", "1223", "4567", "informatika", w1);
        m1.cetak();
        w1.cetak();


    }
}
