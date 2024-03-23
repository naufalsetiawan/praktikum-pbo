// Nama     : Muhammad Naufal Rifqi Setiawan
// NIM      : 24060122130045
// Deskripsi: kelas abstrak, berisi abstraksi bangun datar
// Tanggal  : 23/03/2024

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas=l;
    }

    public double getLuas(){
        return luas;
    }
}