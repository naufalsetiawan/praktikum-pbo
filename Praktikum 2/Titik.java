// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Titik
// Tanggal   : 28/02/2024

public class Titik {
    private float absis;
    private float ordinat;
    private static float counterTitik;

    public Titik(){
        absis=0;
        ordinat=0;
        counterTitik++;
    }

    public Titik(float a, float o){
        this.absis = a;
        this.ordinat = o;
    }

    public void setAbsis(float a){
        absis=a;
    }

    public void setOrdinat(float o){
        ordinat=o;
    }

    public float getAbsis(){
        return absis;
    }
    
    public float getOrdinat(){
        return ordinat;
    }
    
    public static float getCounterTitik(){
        return counterTitik;
    }
    public float getJarakPusat(){
        return(float)Math.sqrt(absis*absis+ordinat*ordinat);
    }
    public void reflexiY(){
        this.absis = this.absis*(-1);
    }
    public void reflexiX(){
        this.ordinat = this.ordinat*(-1);
    }

    public Titik getReflexiX(){
        Titik t=new Titik(this.absis,-(this.ordinat));
        return t;
    }
    public Titik getReflexiY(){
        Titik t=new Titik(-(this.absis),this.ordinat);
        return t;
    }
    
}