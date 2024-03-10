// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class Product
// Tanggal   : 10/03/2024

public class Product {
    private String name;
    private int stock;
    private int price;
    public Product() {
    this.name = "";
    this.stock = 0;
    this.price = 0;
    }
    public Product(String name, int stock, int price) {
    this.name = name;
    this.stock = stock;
    this.price = price;
    }
    public String getName() {
    return name;
    }
    public int getStock() {
    return stock;
    }
    public int getPrice() {
    return price;
    }
    public void setName(String name) {
        assert(name!=""):"Input nama tidak boleh kosong";
        this.name=name;
    }
    public void setStock(int stock) {
        assert(stock>0):"Input stok harus positif";
        this.stock=stock;
    }
    public void setPrice(int price) {
        assert(stock>0):"Input harga harus positif";
        this.price=price;
    }
    public void purchaseProduct(int quantity) {
        assert(quantity>0):"Minimal pembelian adalah 1 item";
        assert(quantity<=this.stock):"Stok tidak mencukupi";
        this.stock-=quantity;
    }
    public void addStock(int quantity) {
        assert(quantity>0):"Input stok harus positif";
        this.stock+=quantity;
    }
}