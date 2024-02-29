// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Main Titik
// Tanggal   : 28/02/2024

public class MTitik {
    public static void main (String[] arg){
        Titik t1;
        Titik t2;
        Titik t3;

        t1=new Titik();
        t2=new Titik();
        t3=new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(0);
        t2.setAbsis(3);
        t2.setOrdinat(4);

        float counterTitik;
        float absis;
        float ordinat;
    

        counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah obejek titik :" + counterTitik);

        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();
        //System.out.printf("t1(%.1f,%.1f)\n",absis,ordinat);
        System.out.println("t1("+absis+","+ordinat+")");

        absis = t2.getAbsis();
        ordinat = t2.getOrdinat();
        //System.out.printf("t2(%.1f,%.1f)\n",absis,ordinat);
        System.out.println("t2("+absis+","+ordinat+")");

        // absis = t3.getAbsis();
        // ordinat = t3.getOrdinat();
        //System.out.printf("t2(%.1f,%.1f)\n",absis,ordinat);
        //System.out.println("t3("+absis+","+ordinat+")");

        System.out.println("Jarak t1 terhadap titik pusat:" + t1.getJarakPusat());
        System.out.println("Jarak t2 terhadap titik pusat:" + t2.getJarakPusat());
        System.out.println("Jarak t3 terhadap titik pusat:" + t3.getJarakPusat());

        t3.reflexiX();
        t3.reflexiY();
        System.out.println("t3("+ t3.getAbsis() +","+ t3.getOrdinat() +")");

        Titik t4 = t1.getReflexiX();
        System.out.println("reflexiX t1("+ t4.getAbsis() +","+ t4.getOrdinat()+")");
        Titik t5 = t2.getReflexiY();
        System.out.println("reflexiY t2("+t5.getAbsis()+","+t5.getOrdinat()+")");
    }

    //Kesimpulan :Dengan mengubah access modifier, kita dapat mengontrol tingkat akses dan visibilitas dari atribut, konstruktor, dan method dalam kelas. Access public memungkinkan kita memanggil atribut, konstruktor, dan method secara langsung dari luar kelas, sedangakan Access Private hanya dapat diakses dari dalam kelas
}