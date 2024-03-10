// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Buku
// Tanggal   : 10/03/2024

    public class Buku {
        private String judul;
        private boolean tersedia;
        public Buku(String judul) {
        this.judul = judul;
        tersedia = true;
        }
        public String getJudul() {
        return judul;
        }
        public boolean isTersedia() {
        return tersedia;
        }
        public void setJudul(String judul) {
        this.judul = judul;
        }
        public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
        }
        }
        
