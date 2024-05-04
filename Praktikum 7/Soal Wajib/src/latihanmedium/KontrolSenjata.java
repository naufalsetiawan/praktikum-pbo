package latihanmedium;

public class KontrolSenjata {
    private final Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru()>0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru()+jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: "+jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak "+jumlah+" kali");
        
        if(senjata.getPeluru()<= 0){
            System.out.println("Peluru Habis");
        }
        else{
            for (int i=jumlah; i>0; i--){
                if (senjata.getPeluru()<=0){
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                else {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                }
            }
            System.out.println(">> Peluru sisa: "+senjata.getPeluru());
        }
    }
    
    public String menusuk(){
        if(senjata.isMenusuk()){
            return("Jleb!");
        }
        else{
           return("Gagal, belum pasang bayonet"); 
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
    }
    
}
