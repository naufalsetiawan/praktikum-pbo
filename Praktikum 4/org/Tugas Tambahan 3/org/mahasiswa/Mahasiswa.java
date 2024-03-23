// Nama     : Muhammad Naufal Rifqi Setiawan
// NIM      : 24060122130045
// Deskripsi: Kelas Mahasiswa extend Kelas Orang
// Tanggal  : 17/03/2024

package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.*;

public class Mahasiswa extends Orang {
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String na,String nik, String nim, String j, WaliMahasiswa w){
        super(na,nik);
        this.nim = nim;
        this.jurusan = j;
        this.wali = w;
    }
    public String getNim(){
        return nim;
    }
    public String getJurusan(){
        return jurusan;
    }
    public WaliMahasiswa getWali(){
        return wali;
    }

    public void setNim(String ni){
        nim = ni;
    }
    public void setJurusan(String j){
        jurusan = j;
    }
    public void setWali(WaliMahasiswa w){
        wali = w;
    }
    public void cetak() {
        System.out.println("///Data Mahasiswa///");
        System.out.println("Nama : "+this.getNama());
        System.out.println("NIK  : " +this.getNik());
        System.out.println("NIM  : " +this.getNim());
        System.out.println("Jurusan: " +this.getJurusan());
        System.out.println("Wali Mahasiswa:");
        System.out.println("Nama    : " +this.wali.getNama());
        System.out.println("Nomor HP: " +this.wali.getNomorHP());
        System.out.println("Alamat  : " +this.wali.getAlamat());
        System.out.println("//////////");
    }
}