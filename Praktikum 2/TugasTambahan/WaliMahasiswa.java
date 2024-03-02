// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Wali Mahasiswa
// Tanggal   : 02/03/2024

public class WaliMahasiswa {
    private String nama;
    private String nomorHP;
    private String alamat;

    public WaliMahasiswa(){
        nama="-";
        nomorHP="-";
        alamat="-";
    }
    public WaliMahasiswa(String na,String no, String a){
        this.nama = na;
        this.nomorHP = no;
        this.alamat = a;
    }
    public String getNama(){
        return nama;
    }
    public String getNomorHP(){
        return nomorHP;
    }
    public String getAlamat(){
        return alamat;
    }
    
    public void setNama(String na){
        nama = na;
    }

    public void setNomorHP(String no){
        nomorHP = no;
    }

    public void setAlamat(String a){
        alamat = a;
    }
    
}