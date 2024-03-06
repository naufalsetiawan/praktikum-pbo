// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Tanggal   : 06/03/2024
// Deskripsi : Class AngkaSial dan Class Main


public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }
    
public static void main(String[] args){
    AngkaSial as = new AngkaSial();
    try{
        as.cobaAngka(10);
        as.cobaAngka(13);
        as.cobaAngka(12);
    }catch(AngkaSialException ase){
        System.out.println(ase.getMessage());
        System.out.println("hati-hati memasukkan angka!!!");
    }
}
}

// Q :Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// A :Tidak dieksekusi, karena jika terjadi eksepsi, dimana dalam kasus ini akan terjadi jika input = 13, maka akan masuk ke kondisional dan terlempar ke AngkaSialException
// Q :Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// A :Ya, karena block catch menerima input yang menyebabkan terjadinya eksepsi pada block try
