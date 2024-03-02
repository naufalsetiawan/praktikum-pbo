// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Mahasiswa
// Tanggal   : 02/03/2024

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(){
        nama="-";
        nim="-";
        jurusan="-";
        wali=null;
    }
    public Mahasiswa(String na,String ni, String j, WaliMahasiswa w){
        this.nama = na;
        this.nim = ni;
        this.jurusan = j;
        this.wali = w;
    }
    public String getNama(){
        return nama;
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
    public void setNama(String na){
        nama = na;
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
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Wali Mahasiswa:");
        System.out.println("Nama: " + wali.getNama());
        System.out.println("Nomor HP: " + wali.getNomorHP());
        System.out.println("Alamat: " + wali.getAlamat());
    }
}