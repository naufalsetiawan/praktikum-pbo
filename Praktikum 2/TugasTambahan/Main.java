// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Main
// Tanggal   : 02/03/2024

public class Main {
    public static void main (String[] arg){
        Mahasiswa m1;
        WaliMahasiswa w1;
    
        w1 = new WaliMahasiswa();
        w1.setNama("Sparkle");
        w1.setNomorHP("088012213003");
        w1.setAlamat("Penacony");
        System.out.println("///Data Wali Mahasiswa///");
        System.out.println("Nama :" + w1.getNama());
        System.out.println("Nomor HP :"+ w1.getNomorHP());
        System.out.println("Alamat :"+ w1.getAlamat());

        m1 = new Mahasiswa();
        m1.setNama("Naufal");
        m1.setNim("24060122130045");
        m1.setJurusan("Informatika");
        m1.setWali(w1);
        System.out.println("///Data Mahasiswa///");
        System.out.println("Nama :" + m1.getNama());
        System.out.println("NIM :"+ m1.getNim());
        System.out.println("Jurusan :"+ m1.getJurusan());
        System.out.println("Nama Wali :"+ m1.getWali().getNama());

        System.out.println("///Cetak///");
        m1.cetak();
        }
}