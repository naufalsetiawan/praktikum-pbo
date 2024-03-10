// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Main
// Tanggal   : 10/03/2024

public class Main {
    public static void main(String[] args) {

        Anggota M,E;
        Buku B1,B2,B3,B4;

        M = new Anggota("Mudryk");
        E = new Anggota("Enzo");
        

        B1 = new Buku("24 Jam Jago Sepak Bola");
        B2 = new Buku("Tips Mudah Mencetak Goal");
        B3 = new Buku("London Is Blue");
        B4 = new Buku("Keep The Blue Flying High");

        try{
            System.out.println("//ANGGOTA 1//");
            System.out.println("Nama : "+M.getNama());
            M.pinjamBuku(B1);
            M.pinjamBuku(B2);
            M.pinjamBuku(B3);
            System.out.println("BUKU YANG DIPINJAM");
            for (int i = 0; i < M.getJumlahBukuPinjaman(); i++) {
                System.out.println((i+1)+"."+ M.getBukuPinjaman()[i].getJudul());
            }
            M.pinjamBuku(B4);
        }
        catch(BukuTidakTersediaException E1){
            System.out.println("Peringatan :"+E1.getMessage());
        }
        catch(MaksimumBukuTerpinjamException E2){
            System.out.println("Peringatan :"+E2.getMessage());
        }
        
        try {
            System.out.println("//ANGGOTA 2//");
            System.out.println("Nama : "+E.getNama());
            E.pinjamBuku(B1);
            System.out.println("BUKU YANG DIPINJAM");
            for (int i = 0; i < E.getJumlahBukuPinjaman(); i++) {
                System.out.println(i+":"+ E.getBukuPinjaman()[i].getJudul());
            }
        } 
        catch(BukuTidakTersediaException E1){
            System.out.println("Peringatan :"+E1.getMessage());
        }
        catch(MaksimumBukuTerpinjamException E2){
            System.out.println("Peringatan :"+E2.getMessage());
        }
    }
    }
