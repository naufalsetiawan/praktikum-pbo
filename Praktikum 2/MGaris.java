// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Main Titik
// Tanggal   : 28/02/2024

public class MGaris {
    public static void main (String[] arg){

        Garis g1 = new Garis(new Titik(1, 2),new Titik(3, 4));
        System.out.println("g1 titik awal : (" +g1.getTitikAwal().getAbsis()+","+g1.getTitikAwal().getOrdinat()+")");
        System.out.println("g1 titik akhir : (" +g1.getTitikAkhir().getAbsis()+","+g1.getTitikAkhir().getOrdinat()+")");
        System.out.println("g1 panjang :" +g1.getPanjang());
        System.out.println("g1 gradien :" +g1.getGradien());

        Garis g2 = g1.getRefleksiY();
        System.out.println("g2 titik awal : (" +g2.getTitikAwal().getAbsis()+","+g2.getTitikAwal().getOrdinat()+")");
        System.out.println("g2 titik akhir : (" +g2.getTitikAkhir().getAbsis()+","+g2.getTitikAkhir().getOrdinat()+")");
        System.out.println("g2 panjang :" +g2.getPanjang());
        System.out.println("g2 gradien :" +g2.getGradien());

        System.out.println("is g1 g2 tegak lurus : "+g1.isTegakLurus(g2));
    }
}
