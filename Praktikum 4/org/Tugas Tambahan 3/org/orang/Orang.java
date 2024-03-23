// Nama     : Muhammad Naufal Rifqi Setiawan
// NIM      : 24060122130045
// Deskripsi: Kelas Orang
// Tanggal  : 17/03/2024

package org.orang;

public class Orang {
    protected String nama;
    protected String nik;

    public Orang(String na, String ni){
        this.nama = na;
        this.nik = ni;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNik(){
        return this.nik;
    }
    
    public void setNama(String na){
        this.nama = na;
    }

    public void setNik(String ni){
        this.nik = ni;
    }

    public void cetak(){
        System.out.println("///Data Orang///");
        System.out.println("Nama : "+this.getNama());
        System.out.println("Nik  : "+this.getNik());
        System.out.println("//////////");
    }
}
