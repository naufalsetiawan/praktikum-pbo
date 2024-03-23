// Nama     : Muhammad Naufal Rifqi Setiawan
// NIM      : 24060122130045
// Deskripsi: Kelas Wali Mahasiswa extend Kelas Orang
// Tanggal  : 17/03/2024

package org.walimahasiswa;

import org.orang.Orang;


public class WaliMahasiswa extends Orang{
    private String nomorHP;
    private String alamat;

    public WaliMahasiswa(String na,String ni, String no, String a){
        super(na, ni);
        this.nomorHP = no;
        this.alamat = a;
    }
    
    public String getNomorHP(){
        return nomorHP;
    }
    public String getAlamat(){
        return alamat;
    }

    public void setNomorHP(String no){
        nomorHP = no;
    }

    public void setAlamat(String a){
        alamat = a;
    }
    public void cetak(){
        System.out.println("///Data Wali Mahasiswa///");
        System.out.println("Nama     : "+this.getNama());
        System.out.println("Nik      : "+this.getNik());
        System.out.println("Nomor HP : "+this.getNomorHP());
        System.out.println("Alamat   : "+this.getAlamat());
        System.out.println("//////////");
    }
}
