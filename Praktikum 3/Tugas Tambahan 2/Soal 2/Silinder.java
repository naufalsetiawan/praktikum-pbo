// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Silinder
// Tanggal   : 10/03/2024

public class Silinder{
    public static void main(String[] args) {
       try{
         int r = 4;
         int h = -4;

         double v=VolumeSilinder(r,h);
         System.out.println("Volume :"+v);
       }
       catch(OddException e){
        System.out.println("Peringatan :"+e.getMessage());
       }
    }

public static double VolumeSilinder(int r, int h) throws OddException{
    assert(h>0 && r>0):"Input harus positif!";

    if(h%2!=0 || r%2!=0){
        throw new OddException("Input harus genap!");
    }

    return(double)Math.PI * Math.pow(r,2)*h;
}
}

class OddException extends Exception{
    public OddException(String message){
        super(message);
    }
}