// Nama      : Muhammad Naufal Rifqi Setiawan
// NIM       : 24060122130045
// Deskripsi : Class MProduct
// Tanggal   : 10/03/2024

  public class MProduct {
        public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("Product Price: " + product.getPrice());
        product.purchaseProduct(-2);
        System.out.println("Product Stock: " + product.getStock());
        }
    }
