import com.polban.jtk.sales.*;

/**
 *
 * @author Afriza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product = new Product("Laptop", 15000000, 10);
        Sales sales = new Sales(product);

        sales.sellProduct(3);
        sales.restockProduct(5);
        sales.updateProductPrice(14000000);
    }
    
}
