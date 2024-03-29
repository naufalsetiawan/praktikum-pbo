// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Anggota
// Tanggal   : 10/03/2024

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;
    public Anggota(String nama) {
    this.nama = nama;
    bukuPinjaman = new Buku[3];
    jumlahBukuPinjaman = 0;
    }
    public String getNama() {
    return nama;
    }
    public Buku[] getBukuPinjaman() {
    return bukuPinjaman;
    }
    public int getJumlahBukuPinjaman() {
    return jumlahBukuPinjaman;
    }
    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        if(jumlahBukuPinjaman>=3){
            throw new MaksimumBukuTerpinjamException("Jumlah maksimum peminjaman tercapai");
        }
        if(!buku.isTersedia()){
            throw new BukuTidakTersediaException("Buku tidak tersedia");
        }

    buku.setTersedia(false);
    bukuPinjaman[jumlahBukuPinjaman] = buku;
    jumlahBukuPinjaman++;
    }
    }