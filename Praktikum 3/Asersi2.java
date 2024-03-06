// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Tanggal   : 06/03/2024
// Deskripsi : Class Asersi 2 dan Class Lingkaran

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari=jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args){
        double jariJari=0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran =" + kelilingLingkaran);
    }
}

// Q : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
// A : pada baris ke-19, pesan yang seharusnya dicetak adalah "jari jari harus positif"
