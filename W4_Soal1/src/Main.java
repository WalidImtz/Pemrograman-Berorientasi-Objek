import com.polban.jtk.Product;
import com.polban.jtk.Sales;

public class Main {
    public static void main(String[] args) {
        // Buat object produk dengan 10 unit
        Product laptop = new Product("Laptop", 14000000, 10);

        // Buat object sales
        Sales laptopSales = new Sales(laptop);

        // Lakukan penjualan produk dengan quantity 5
        laptopSales.sellProduct(5);

        // Lakukan restock
        laptopSales.restockProduct(5);

        // Harga menjadi 15,000,000
        laptopSales.updateProductPrice(20000000);

        // Harga menjadi nilai negatif
        laptopSales.updateProductPrice(-7000000);

        // Modifikasi output harga baru
        laptopSales.updateProductPrice(19000000);
    }
}
