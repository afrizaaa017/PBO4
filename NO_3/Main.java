import com.polban.jtk.sales.*;

// import com.polban.jtk.sales.Product;
// import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 15000000, 10);
        Sales sales = new Sales(product);

        sales.sellProduct(3);
        sales.restockProduct(5);
        sales.updateProductPrice(14000000);
    }
    
}

