// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Garis
// Tanggal   : 28/02/2024

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal= titikAwal;
        this.titikAkhir= titikAkhir;
    }
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal=titikAwal;
    }

    public void setOrdinat(Titik titikAkhir){
        this.titikAkhir=titikAkhir;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }
    
    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public float getPanjang(){
        return (float)Math.sqrt(Math.pow((getTitikAkhir().getAbsis())-(getTitikAwal().getAbsis()),2) + Math.pow((getTitikAkhir().getOrdinat())-(getTitikAwal().getOrdinat()),2));
    }
    public float getGradien(){
        return (float)(((getTitikAkhir().getOrdinat())-(getTitikAwal().getOrdinat()))/((getTitikAkhir().getAbsis())-(getTitikAwal().getAbsis())));
    }

    public Garis getRefleksiY() {
        Titik titikAwalR = new Titik(-getTitikAwal().getAbsis(), getTitikAwal().getOrdinat());
        Titik titikAkhirR = new Titik(-getTitikAkhir().getAbsis(), getTitikAkhir().getOrdinat());
        return new Garis(titikAwalR, titikAkhirR);
    }
    
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }
   }